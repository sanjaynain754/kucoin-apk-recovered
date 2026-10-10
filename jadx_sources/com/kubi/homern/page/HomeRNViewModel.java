package com.kubi.homern.page;

import androidx.lifecycle.ViewModel;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.homern.beans.VipLevelUpDialogInfo;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27025c;
import java.lang.reflect.Type;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: HomeRNViewModel.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005J\u0006\u0010\u0015\u001a\u00020\u0013R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/homern/page/HomeRNViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "beforeShowLevel", "", "Ljava/lang/Integer;", "isNeedShowVipDilogChecking", "", "isVipDialogShow", "homeVipDialogEnable", "getHomeVipDialogEnable", "()Z", "homeVipDialogEnable$delegate", "Lkotlin/Lazy;", "checkShowVipLevelUpDialog", "Lcom/kubi/homern/page/HomeRNViewModel$VipLevelUpDialogAction;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onVipLevelUpDialogShown", "", "vipLevel", "onVipLevelUpDialogClosed", "Companion", "VipLevelUpDialogAction", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeRNViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeRNViewModel.kt\ncom/kubi/homern/page/HomeRNViewModel\n+ 2 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,79:1\n35#2,3:80\n35#3,4:83\n39#3:89\n44#4,2:87\n*S KotlinDebug\n*F\n+ 1 HomeRNViewModel.kt\ncom/kubi/homern/page/HomeRNViewModel\n*L\n58#1:80,3\n41#1:83,4\n41#1:89\n41#1:87,2\n*E\n"})
public final class HomeRNViewModel extends ViewModel {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f26956Z = new Companion(null);

    /* JADX INFO: renamed from: V */
    @Nullable
    public volatile Integer f26957V;

    /* JADX INFO: renamed from: W */
    public boolean f26958W;

    /* JADX INFO: renamed from: X */
    public boolean f26959X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f26960Y = LazyKt.lazy(new Function0() { // from class: com.kubi.homern.page.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(HomeRNViewModel.m31253q());
        }
    });

    /* JADX INFO: compiled from: HomeRNViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/homern/page/HomeRNViewModel$Companion;", "", "<init>", "()V", "TAG", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.homern.page.HomeRNViewModel$a */
    /* JADX INFO: compiled from: HomeRNViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/homern/page/HomeRNViewModel$VipLevelUpDialogAction;", "", "None", "ClearEffects", "Show", "Lcom/kubi/homern/page/HomeRNViewModel$VipLevelUpDialogAction$ClearEffects;", "Lcom/kubi/homern/page/HomeRNViewModel$VipLevelUpDialogAction$None;", "Lcom/kubi/homern/page/HomeRNViewModel$VipLevelUpDialogAction$Show;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC15155a {

        /* JADX INFO: renamed from: com.kubi.homern.page.HomeRNViewModel$a$a */
        /* JADX INFO: compiled from: HomeRNViewModel.kt */
        @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/homern/page/HomeRNViewModel$VipLevelUpDialogAction$ClearEffects;", "Lcom/kubi/homern/page/HomeRNViewModel$VipLevelUpDialogAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class a implements InterfaceC15155a {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final a f26961a = new a();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            @NotNull
            public String toString() {
                return "ClearEffects";
            }

            public int hashCode() {
                return -1861500478;
            }
        }

        /* JADX INFO: renamed from: com.kubi.homern.page.HomeRNViewModel$a$b */
        /* JADX INFO: compiled from: HomeRNViewModel.kt */
        @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/homern/page/HomeRNViewModel$VipLevelUpDialogAction$None;", "Lcom/kubi/homern/page/HomeRNViewModel$VipLevelUpDialogAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class b implements InterfaceC15155a {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final b f26962a = new b();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof b);
            }

            @NotNull
            public String toString() {
                return "None";
            }

            public int hashCode() {
                return 758215685;
            }
        }

        /* JADX INFO: renamed from: com.kubi.homern.page.HomeRNViewModel$a$c, reason: from toString */
        /* JADX INFO: compiled from: HomeRNViewModel.kt */
        @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/homern/page/HomeRNViewModel$VipLevelUpDialogAction$Show;", "Lcom/kubi/homern/page/HomeRNViewModel$VipLevelUpDialogAction;", "vipLevel", "", "jsonData", "", "<init>", "(ILjava/lang/String;)V", "getVipLevel", "()I", "getJsonData", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class Show implements InterfaceC15155a {

            /* JADX INFO: renamed from: a, reason: from toString */
            public final int vipLevel;

            /* JADX INFO: renamed from: b, reason: from toString */
            @NotNull
            public final String jsonData;

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Show)) {
                    return false;
                }
                Show show = (Show) other;
                return this.vipLevel == show.vipLevel && Intrinsics.areEqual(this.jsonData, show.jsonData);
            }

            public Show(int i11, @NotNull String jsonData) {
                Intrinsics.checkNotNullParameter(jsonData, "jsonData");
                this.vipLevel = i11;
                this.jsonData = jsonData;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getJsonData() {
                return this.jsonData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final int getVipLevel() {
                return this.vipLevel;
            }

            public int hashCode() {
                return (Integer.hashCode(this.vipLevel) * 31) + this.jsonData.hashCode();
            }

            @NotNull
            public String toString() {
                return "Show(vipLevel=" + this.vipLevel + ", jsonData=" + this.jsonData + ')';
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.homern.page.HomeRNViewModel$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C15156b extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: r */
    public final void m31255r() {
        this.f26959X = false;
    }

    /* JADX INFO: renamed from: p */
    private final boolean m31252p() {
        return ((Boolean) this.f26960Y.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m31253q() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C15156b().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("home_vip_dialog", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true) && C24129b.m58030b(SiteVisibleConfigKey.Vip);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: o */
    public final Object m31254o(@NotNull Continuation<? super InterfaceC15155a> continuation) {
        HomeRNViewModel$checkShowVipLevelUpDialog$1 homeRNViewModel$checkShowVipLevelUpDialog$1;
        Object show;
        if (continuation instanceof HomeRNViewModel$checkShowVipLevelUpDialog$1) {
            homeRNViewModel$checkShowVipLevelUpDialog$1 = (HomeRNViewModel$checkShowVipLevelUpDialog$1) continuation;
            int i11 = homeRNViewModel$checkShowVipLevelUpDialog$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                homeRNViewModel$checkShowVipLevelUpDialog$1.label = i11 - Integer.MIN_VALUE;
            } else {
                homeRNViewModel$checkShowVipLevelUpDialog$1 = new HomeRNViewModel$checkShowVipLevelUpDialog$1(this, continuation);
            }
        } else {
            homeRNViewModel$checkShowVipLevelUpDialog$1 = new HomeRNViewModel$checkShowVipLevelUpDialog$1(this, continuation);
        }
        Object objM91049g = homeRNViewModel$checkShowVipLevelUpDialog$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = homeRNViewModel$checkShowVipLevelUpDialog$1.label;
        try {
            try {
                if (i12 == 0) {
                    ResultKt.throwOnFailure(objM91049g);
                    if (!m31252p() || !IUserService.a.get().c()) {
                        return InterfaceC15155a.a.f26961a;
                    }
                    if (this.f26958W || this.f26959X) {
                        return InterfaceC15155a.b.f26962a;
                    }
                    this.f26958W = true;
                    AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
                    HomeRNViewModel$checkShowVipLevelUpDialog$info$1 homeRNViewModel$checkShowVipLevelUpDialog$info$1 = new HomeRNViewModel$checkShowVipLevelUpDialog$info$1(null);
                    homeRNViewModel$checkShowVipLevelUpDialog$1.label = 1;
                    objM91049g = C41686h.m91049g(abstractC41697j0M94120b, homeRNViewModel$checkShowVipLevelUpDialog$info$1, homeRNViewModel$checkShowVipLevelUpDialog$1);
                    if (objM91049g == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objM91049g);
                }
                VipLevelUpDialogInfo vipLevelUpDialogInfo = (VipLevelUpDialogInfo) objM91049g;
                if (vipLevelUpDialogInfo != null) {
                    Integer num = this.f26957V;
                    int vipLevel = vipLevelUpDialogInfo.getVipLevel();
                    if (num != null && num.intValue() == vipLevel) {
                        show = InterfaceC15155a.b.f26962a;
                    } else {
                        int vipLevel2 = vipLevelUpDialogInfo.getVipLevel();
                        String strM66919i = C27099x.m66919i(vipLevelUpDialogInfo, false, 2, null);
                        if (strM66919i == null) {
                            strM66919i = "";
                        }
                        show = new InterfaceC15155a.Show(vipLevel2, strM66919i);
                    }
                } else {
                    show = InterfaceC15155a.b.f26962a;
                }
                this.f26958W = false;
                return show;
            } catch (CancellationException e11) {
                throw e11;
            } catch (Exception e12) {
                C44128b.m97261e("HomeRNViewModel", "[checkShowVipLevelUpDialog] error:" + e12.getMessage());
                InterfaceC15155a.b bVar = InterfaceC15155a.b.f26962a;
                this.f26958W = false;
                return bVar;
            }
        } catch (Throwable th2) {
            this.f26958W = false;
            throw th2;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m31256s(int i11) {
        this.f26957V = Integer.valueOf(i11);
        this.f26959X = true;
    }
}
