package com.meetsuccess.workmanagerallscenario;

import android.content.Context;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class MyWorkC extends Worker {

    private static final String TAB =MyWorkC.class.getSimpleName();

    public MyWorkC(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {

        Log.e(TAB,"My WorkC");

        return Result.success();
    }
}
