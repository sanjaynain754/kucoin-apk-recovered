package com.jumio.core.util;

import com.jumio.core.interfaces.QAInterface;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00062\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\b\"\u0004\u0018\u00010\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/jumio/core/util/DefaultQA;", "Lcom/jumio/core/interfaces/QAInterface;", "<init>", "()V", TUIConstants.TIMPush.NOTIFICATION.ACTION, "", "", "parameter", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DefaultQA implements QAInterface {
    @Override // com.jumio.core.interfaces.QAInterface
    public void action(@NotNull String action, @NotNull Object... parameter) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(parameter, "parameter");
    }
}
