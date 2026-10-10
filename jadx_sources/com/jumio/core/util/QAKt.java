package com.jumio.core.util;

import com.jumio.core.ServiceLocator;
import com.jumio.core.interfaces.QAInterface;
import com.jumio.core.util.QAKt;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"QA", "Lcom/jumio/core/interfaces/QAInterface;", "getQA", "()Lcom/jumio/core/interfaces/QAInterface;", "jumio-core_release"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class QAKt {
    /* JADX INFO: renamed from: a */
    public static final QAInterface m14601a() {
        return new DefaultQA();
    }

    @NotNull
    public static final QAInterface getQA() {
        return (QAInterface) ServiceLocator.INSTANCE.getServiceImplementation(QAInterface.class, new Function0() { // from class: x9.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QAKt.m14601a();
            }
        });
    }
}
