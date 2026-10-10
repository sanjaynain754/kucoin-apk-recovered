package com.jumio.core.util;

import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004\u001a\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"isNotNullOrEmpty", "", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function1;", "sanitize", "subfolderAllowed", "", "jumio-core_release"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class StringUtilKt {
    public static /* synthetic */ String sanitize$default(String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return sanitize(str, z11);
    }

    public static final void isNotNullOrEmpty(@Nullable String str, @NotNull Function1<? super String, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (str == null || str.length() <= 0) {
            return;
        }
        action.invoke(str);
    }

    @NotNull
    public static final String sanitize(@NotNull String str, boolean z11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String strReplace$default = StringsKt.replace$default(StringsKt.replace$default(str, "..", "", false, 4, (Object) null), "//", "/", false, 4, (Object) null);
        return !z11 ? StringsKt.replace$default(strReplace$default, "/", "", false, 4, (Object) null) : strReplace$default;
    }
}
