package com.kubi.home.main;

import android.net.Uri;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.gson.reflect.TypeToken;
import com.kubi.home.common.InterfaceC14524b;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.utils.C27099x;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: com.kubi.home.main.f */
/* JADX INFO: compiled from: HomeConfigEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0006\u0010\u0007\u001a\u00020\u0002\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, m90084d2 = {"KEY_HOME_CONFIG", "Lcom/kubi/utils/storage/StorageId;", "", "getKEY_HOME_CONFIG", "()Lcom/kubi/utils/storage/StorageId;", "getUserLevelChange", "", "getStaffServiceUrl", "HomeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeConfigEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeConfigEx.kt\ncom/kubi/home/main/HomeConfigExKt\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n+ 4 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,45:1\n32#2:46\n32#2:54\n57#3,2:47\n25#3:49\n59#3,3:51\n57#3,2:55\n25#3:57\n59#3,3:59\n149#4:50\n149#4:58\n*S KotlinDebug\n*F\n+ 1 HomeConfigEx.kt\ncom/kubi/home/main/HomeConfigExKt\n*L\n20#1:46\n28#1:54\n20#1:47,2\n20#1:49\n20#1:51,3\n28#1:55,2\n28#1:57\n28#1:59,3\n20#1:50\n28#1:58\n*E\n"})
public final class C14614f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final StorageId<String> f25762a = new StorageId<>("CATE_KV_HOME", "home_config", null, false, 12, null);

    /* JADX INFO: renamed from: com.kubi.home.main.f$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes15.dex */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0004"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/utils/extensions/JsonExKt$parseJson$$inlined$fromJson$1", "com/kubi/utils/extensions/JsonExKt$toEntity$lambda$1$$inlined$parseJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class a extends TypeToken<HomeConfigEntity> {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final StorageId<String> m29398a() {
        return f25762a;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m29399b() {
        Object objM103844constructorimpl;
        String strM102326h = C46392a.m102326h(f25762a, "");
        try {
            Result.Companion companion = Result.INSTANCE;
            C27099x c27099x = C27099x.f54458a;
            objM103844constructorimpl = Result.m103844constructorimpl(C27099x.m66914d(strM102326h, new a().getType()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97262f(JPushConstants.Analysis.KEY_JSON, "数据转换失败", thM103847exceptionOrNullimpl);
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        HomeConfigEntity homeConfigEntity = (HomeConfigEntity) objM103844constructorimpl;
        String customerServiceEntranceUrl = homeConfigEntity != null ? homeConfigEntity.getCustomerServiceEntranceUrl() : null;
        String localString = MultiLanguageManager.f46811g.getLocalString();
        if (customerServiceEntranceUrl == null || customerServiceEntranceUrl.length() == 0) {
            String string = Uri.parse(InterfaceC14524b.f25591a).buildUpon().appendPath("support").appendQueryParameter("lang", localString).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return com.kubi.user.api.d.d(string, false, 2, (Object) null);
        }
        if (!StringsKt.startsWith$default(customerServiceEntranceUrl, "http", false, 2, (Object) null)) {
            return customerServiceEntranceUrl;
        }
        String string2 = Uri.parse(customerServiceEntranceUrl).buildUpon().appendQueryParameter("lang", localString).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return com.kubi.user.api.d.d(string2, false, 2, (Object) null);
    }
}
