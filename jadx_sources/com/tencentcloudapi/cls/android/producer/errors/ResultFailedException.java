package com.tencentcloudapi.cls.android.producer.errors;

import java.util.List;
import jc0.C40386d;
import kc0.C40984a;

/* JADX INFO: loaded from: classes2.dex */
public class ResultFailedException extends ProducerException {
    private final C40386d result;

    public String getErrorCode() {
        return this.result.m89002a();
    }

    public String getErrorMessage() {
        return this.result.m89003b();
    }

    public List<C40984a> getReservedAttempts() {
        return this.result.m89004c();
    }

    public C40386d getResult() {
        return this.result;
    }

    public ResultFailedException(C40386d c40386d) {
        this.result = c40386d;
    }
}
