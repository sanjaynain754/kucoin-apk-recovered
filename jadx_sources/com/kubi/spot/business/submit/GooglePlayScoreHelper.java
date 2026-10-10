package com.kubi.spot.business.submit;

import androidx.fragment.app.FragmentActivity;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27100x0;
import id.C38519a;
import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ru.C44176b;
import y70.C46392a;

/* JADX INFO: renamed from: com.kubi.spot.business.submit.e, reason: from Kotlin metadata */
/* JADX INFO: compiled from: GooglePlayScoreHelper.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u001a\u0010\u0013\u001a\u00020\u00102\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nJ\u0015\u0010\u0014\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0005H\u0002J\b\u0010\u0017\u001a\u00020\u0005H\u0002J\b\u0010\u0018\u001a\u00020\u0005H\u0002J\b\u0010\u0019\u001a\u00020\u0005H\u0002J\b\u0010\u001a\u001a\u00020\u0005H\u0002J\b\u0010\u001b\u001a\u00020\u0005H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0004\u0010\u0006R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/spot/business/submit/GooglePlayScoreHelper;", "", "<init>", "()V", "isOpen", "", "()Ljava/lang/Boolean;", "isOpen$delegate", "Lkotlin/Lazy;", "orderParams", "", "", "rise", "", "Ljava/lang/Double;", "showGooglePlayScore", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "setOrderParams", "setRise", "(Ljava/lang/Double;)V", "isShowGooglePlayScore", "isCloudConfigOpen", "isSell", "isRise", "isLogin", "isNewYear", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGooglePlayScoreHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePlayScoreHelper.kt\ncom/kubi/spot/business/submit/GooglePlayScoreHelper\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,101:1\n32#2:102\n23#2,2:103\n35#3,4:105\n39#3:111\n44#4,2:109\n1#5:112\n*S KotlinDebug\n*F\n+ 1 GooglePlayScoreHelper.kt\ncom/kubi/spot/business/submit/GooglePlayScoreHelper\n*L\n96#1:102\n97#1:103,2\n21#1:105,4\n21#1:111\n21#1:109,2\n*E\n"})
public final class GooglePlayScoreHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f50389a = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.submit.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return GooglePlayScoreHelper.m61646g();
        }
    });

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Map<String, String> f50390b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    @Nullable
    public Double f50391c;

    /* JADX INFO: renamed from: com.kubi.spot.business.submit.e$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: g */
    public static final Boolean m61646g() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_spot_review_visible", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return (Boolean) objM20457a;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m61647n(FragmentActivity fragmentActivity) {
        if (fragmentActivity != null) {
            C44176b.f97516a.m97395b(fragmentActivity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m61649d() {
        return IUserService.a.get().c();
    }

    /* JADX INFO: renamed from: f */
    public final Boolean m61651f() {
        return (Boolean) this.f50389a.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m61652h() {
        Double d11 = this.f50391c;
        return d11 != null && d11.doubleValue() * ((double) 100) > 5.0d;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m61653i() {
        return Intrinsics.areEqual(this.f50390b.get("side"), "sell");
    }

    /* JADX INFO: renamed from: k */
    public final void m61655k(@NotNull Map<String, String> orderParams) {
        Intrinsics.checkNotNullParameter(orderParams, "orderParams");
        for (Map.Entry<String, String> entry : orderParams.entrySet()) {
            this.f50390b.put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m61656l(@Nullable Double d11) {
        this.f50391c = d11;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m61648c() {
        Boolean boolM61651f = m61651f();
        if (boolM61651f != null) {
            return boolM61651f.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m61650e() {
        int i11 = Calendar.getInstance().get(1);
        C38519a c38519a = C38519a.f86479a;
        String strM102326h = C46392a.m102326h(c38519a.m87138m(), "0");
        C46392a.m102333p(c38519a.m87138m(), String.valueOf(i11));
        return !Intrinsics.areEqual(String.valueOf(i11), strM102326h);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m61654j() {
        if (m61649d() && m61648c() && m61653i() && m61652h() && m61650e()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m61657m(@Nullable final FragmentActivity fragmentActivity) {
        if (m61654j()) {
            C27100x0.m66924e(new Function0() { // from class: com.kubi.spot.business.submit.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GooglePlayScoreHelper.m61647n(fragmentActivity);
                }
            });
        }
    }
}
