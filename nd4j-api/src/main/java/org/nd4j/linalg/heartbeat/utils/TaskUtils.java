package org.nd4j.linalg.heartbeat.utils;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.dataset.DataSet;
import org.nd4j.linalg.dataset.api.iterator.DataSetIterator;
import org.nd4j.linalg.heartbeat.reports.Task;

/**
 * @author raver119@gmail.com
 */
public class TaskUtils {
    public static Task buildTask(INDArray[] array, INDArray[] labels) {
        Task task = new Task();
        task.setNumFeatures(array[0].columns());

        return task;
    }

    public static Task buildTask(INDArray array, INDArray labels) {
        Task task = new Task();
        task.setNumFeatures(array.columns());

        return task;
    }

    public static Task buildTask(INDArray array) {
        Task task = new Task();
        task.setNumFeatures(array.columns());

        return task;
    }

    public static Task buildTask(DataSet dataSet) {
        Task task = new Task();
        task.setNumFeatures(dataSet.numInputs());
        task.setNumLabels(dataSet.numOutcomes());

        return task;
    }

    public static Task buildTask(org.nd4j.linalg.dataset.api.DataSet dataSet) {
        Task task = new Task();
        task.setNumFeatures(dataSet.numInputs());
        task.setNumLabels(dataSet.numOutcomes());

        return task;
    }

    public static Task buildTask(DataSetIterator dataSetIterator) {
        Task task = new Task();
        task.setNumFeatures(dataSetIterator.inputColumns());
        task.setNumLabels(dataSetIterator.totalOutcomes());

        return task;
    }
}
