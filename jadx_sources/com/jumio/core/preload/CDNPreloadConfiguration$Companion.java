package com.jumio.core.preload;

import cn.jiguang.privates.push.constants.JPushConstants;
import com.jumio.core.util.StringUtilKt;
import com.tencent.bugly.proguard.C34052z4;
import jumio.core.AbstractC40519D2;
import jumio.core.AbstractC40556L;
import jumio.core.C40551K;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¨\u0006\u000b"}, m90084d2 = {"Lcom/jumio/core/preload/CDNPreloadConfiguration$Companion;", "", "<init>", "()V", "fromJson", "Lcom/jumio/core/preload/CDNPreloadConfiguration;", JPushConstants.Analysis.KEY_JSON, "Lorg/json/JSONObject;", "maybeAddModelFolderPrefix", "", "filePath", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CDNPreloadConfiguration$Companion {
    @NotNull
    public final C40551K fromJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        String strOptString = json.optString(C34052z4.f72599k);
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        String strSanitize = StringUtilKt.sanitize(strOptString, false);
        String strOptString2 = json.optString("file");
        Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
        String str = AbstractC40556L.f90029a;
        if (!StringsKt.startsWith$default(strOptString2, str, false, 2, (Object) null)) {
            strOptString2 = AbstractC40519D2.m89156a(str, strOptString2);
        }
        String strSanitize2 = StringUtilKt.sanitize(strOptString2, true);
        String strOptString3 = json.optString("hash");
        Intrinsics.checkNotNullExpressionValue(strOptString3, "optString(...)");
        return new C40551K(strSanitize, strSanitize2, strOptString3);
    }

    public CDNPreloadConfiguration$Companion(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
