package com.jumio.sdk.exceptions;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"createMessage", "", "permissions", "", "([Ljava/lang/String;)Ljava/lang/String;", "jumio-core_release"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMissingPermissionException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MissingPermissionException.kt\ncom/jumio/sdk/exceptions/MissingPermissionExceptionKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n13402#2,2:18\n*S KotlinDebug\n*F\n+ 1 MissingPermissionException.kt\ncom/jumio/sdk/exceptions/MissingPermissionExceptionKt\n*L\n11#1:18,2\n*E\n"})
public final class MissingPermissionExceptionKt {
    public static final String access$createMessage(String[] strArr) {
        StringBuilder sb2 = new StringBuilder("You need to acquire the following permissions dynamically before starting the SDK: ");
        for (String str : strArr) {
            sb2.append(str);
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        sb2.append("More information can be found here: https://developer.android.com/training/permissions/requesting.html");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "with(...)");
        return string;
    }
}
