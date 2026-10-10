package com.geetest.captcha;

import android.content.Context;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.geetest.captcha.utils.LogUtils;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.geetest.captcha.u */
/* JADX INFO: loaded from: classes45.dex */
public final class C6689u {
    /* JADX INFO: renamed from: a */
    public static int m12553a(@NotNull Context context, @NotNull String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        return m12554a(context, name, TtmlNode.TAG_STYLE);
    }

    /* JADX INFO: renamed from: a */
    public static int m12554a(Context context, String str, String str2) {
        int identifier = context.getApplicationContext().getResources().getIdentifier(str, str2, context.getPackageName());
        if (identifier == 0) {
            LogUtils.f11200a.release("ID.getIdentifier resource: " + str + ", type: " + str2 + ", undefined");
        }
        return identifier;
    }
}
