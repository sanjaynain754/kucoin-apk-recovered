package com.kubi.home.navigation;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.kubi.home.entity.NavigationAvatarEntity;
import com.kubi.kucoin.home.cards.ExtensionKt;
import com.kubi.mine.api.entity.KycStatusEntity;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: NavigationViewModel.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/home/navigation/NavigationViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "api", "Lcom/kubi/home/navigation/NavigationApi;", "avatarLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/home/entity/NavigationAvatarEntity;", "getAvatarLiveData", "()Landroidx/lifecycle/MutableLiveData;", "kycStatusLiveData", "Lcom/kubi/mine/api/entity/KycStatusEntity;", "getKycStatusLiveData", "updateData", "", "queryKycStatus", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class NavigationViewModel extends ViewModel {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f25887Y = new Companion(null);

    /* JADX INFO: renamed from: V */
    @NotNull
    public final NavigationApi f25888V = (NavigationApi) RetrofitFlowExKt.m42820a(NavigationApi.class);

    /* JADX INFO: renamed from: W */
    @NotNull
    public final MutableLiveData<NavigationAvatarEntity> f25889W = new MutableLiveData<>();

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<KycStatusEntity> f25890X = new MutableLiveData<>();

    /* JADX INFO: compiled from: NavigationViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/home/navigation/NavigationViewModel$Companion;", "", "<init>", "()V", "AD_POSITION", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final MutableLiveData<NavigationAvatarEntity> m29679n() {
        return this.f25889W;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final MutableLiveData<KycStatusEntity> m29680o() {
        return this.f25890X;
    }

    /* JADX INFO: renamed from: p */
    public final void m29681p() {
        ExtensionKt.m32184j(this, new NavigationViewModel$queryKycStatus$1(this, null));
    }

    /* JADX INFO: renamed from: q */
    public final void m29682q() {
        ExtensionKt.m32184j(this, new NavigationViewModel$updateData$1(this, null));
    }
}
