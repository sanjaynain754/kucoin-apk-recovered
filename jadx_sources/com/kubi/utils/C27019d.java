package com.kubi.utils;

import android.content.Context;
import androidx.annotation.StringRes;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.utils.d */
/* JADX INFO: compiled from: ApplicationCompat.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\u0010\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Landroid/content/Context;", "", "id", "", "", "formatArgs", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;", "Utils_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C27019d {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m66519a(@NotNull Context context, @StringRes int i11, @NotNull Object[] formatArgs) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        switch (formatArgs.length) {
            case 0:
                String string = context.getResources().getString(i11);
                Intrinsics.checkNotNullExpressionValue(string, "resources.getString(id)");
                return string;
            case 1:
                String string2 = context.getResources().getString(i11, String.valueOf(formatArgs[0]));
                Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(id, formatArgs[0].toString())");
                return string2;
            case 2:
                String string3 = context.getResources().getString(i11, String.valueOf(formatArgs[0]), String.valueOf(formatArgs[1]));
                Intrinsics.checkNotNullExpressionValue(string3, "resources.getString(id, …formatArgs[1].toString())");
                return string3;
            case 3:
                String string4 = context.getResources().getString(i11, String.valueOf(formatArgs[0]), String.valueOf(formatArgs[1]), String.valueOf(formatArgs[2]));
                Intrinsics.checkNotNullExpressionValue(string4, "resources.getString(\n   …s[2].toString()\n        )");
                return string4;
            case 4:
                String string5 = context.getResources().getString(i11, String.valueOf(formatArgs[0]), String.valueOf(formatArgs[1]), String.valueOf(formatArgs[2]), String.valueOf(formatArgs[3]));
                Intrinsics.checkNotNullExpressionValue(string5, "resources.getString(\n   …s[3].toString()\n        )");
                return string5;
            case 5:
                String string6 = context.getResources().getString(i11, String.valueOf(formatArgs[0]), String.valueOf(formatArgs[1]), String.valueOf(formatArgs[2]), String.valueOf(formatArgs[3]), String.valueOf(formatArgs[4]));
                Intrinsics.checkNotNullExpressionValue(string6, "resources.getString(\n   …s[4].toString()\n        )");
                return string6;
            case 6:
                String string7 = context.getResources().getString(i11, String.valueOf(formatArgs[0]), String.valueOf(formatArgs[1]), String.valueOf(formatArgs[2]), String.valueOf(formatArgs[3]), String.valueOf(formatArgs[4]), String.valueOf(formatArgs[5]));
                Intrinsics.checkNotNullExpressionValue(string7, "resources.getString(\n   …s[5].toString()\n        )");
                return string7;
            case 7:
                String string8 = context.getResources().getString(i11, String.valueOf(formatArgs[0]), String.valueOf(formatArgs[1]), String.valueOf(formatArgs[2]), String.valueOf(formatArgs[3]), String.valueOf(formatArgs[4]), String.valueOf(formatArgs[5]), String.valueOf(formatArgs[6]));
                Intrinsics.checkNotNullExpressionValue(string8, "resources.getString(\n   …s[6].toString()\n        )");
                return string8;
            case 8:
                String string9 = context.getResources().getString(i11, String.valueOf(formatArgs[0]), String.valueOf(formatArgs[1]), String.valueOf(formatArgs[2]), String.valueOf(formatArgs[3]), String.valueOf(formatArgs[4]), String.valueOf(formatArgs[5]), String.valueOf(formatArgs[6]), String.valueOf(formatArgs[7]));
                Intrinsics.checkNotNullExpressionValue(string9, "resources.getString(\n   …s[7].toString()\n        )");
                return string9;
            case 9:
                String string10 = context.getResources().getString(i11, String.valueOf(formatArgs[0]), String.valueOf(formatArgs[1]), String.valueOf(formatArgs[2]), String.valueOf(formatArgs[3]), String.valueOf(formatArgs[4]), String.valueOf(formatArgs[5]), String.valueOf(formatArgs[6]), String.valueOf(formatArgs[7]), String.valueOf(formatArgs[8]));
                Intrinsics.checkNotNullExpressionValue(string10, "resources.getString(\n   …s[8].toString()\n        )");
                return string10;
            default:
                throw new RuntimeException("不支持参数长度");
        }
    }
}
