package com.jumio.core.interfaces;

import com.jumio.core.Injected;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Injected
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J-\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00042\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0006\"\u0004\u0018\u00010\u0001H&¢\u0006\u0002\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/interfaces/QAInterface;", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, "", "", "parameter", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface QAInterface {
    void action(@NotNull String action, @NotNull Object... parameter);
}
