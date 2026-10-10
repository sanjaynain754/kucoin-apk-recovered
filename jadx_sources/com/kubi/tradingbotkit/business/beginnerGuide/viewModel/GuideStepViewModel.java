package com.kubi.tradingbotkit.business.beginnerGuide.viewModel;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.media3.common.MimeTypes;
import com.kubi.tradingbotkit.entity.gudiGuide.PictureEntity;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GuideStepViewModel.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000f\u001a\u00020\u0010R-\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/beginnerGuide/viewModel/GuideStepViewModel;", "Landroidx/lifecycle/AndroidViewModel;", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "pictureHashMap", "Landroidx/lifecycle/MediatorLiveData;", "", "", "Lcom/kubi/tradingbotkit/entity/gudiGuide/PictureEntity;", "getPictureHashMap", "()Landroidx/lifecycle/MediatorLiveData;", "pictureHashMap$delegate", "Lkotlin/Lazy;", "getGuidePicture", "", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class GuideStepViewModel extends AndroidViewModel {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f52282V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuideStepViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f52282V = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.beginnerGuide.viewModel.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GuideStepViewModel.m63852q();
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public static final MediatorLiveData m63852q() {
        return new MediatorLiveData();
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final MediatorLiveData<Map<String, PictureEntity>> m63854p() {
        return (MediatorLiveData) this.f52282V.getValue();
    }

    /* JADX INFO: renamed from: o */
    public final void m63853o() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new GuideStepViewModel$getGuidePicture$1(this, null), 2, null);
    }
}
