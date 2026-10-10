package com.kubi.assets.options.main;

import com.kubi.mvi.state.BaseStateVM;
import com.kubi.user.api.IUserService;
import com.kubi.utils.extensions.C27025c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.options.main.d, reason: from Kotlin metadata */
/* JADX INFO: compiled from: OptionsAssetMainViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0094@¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0002R\u0014\u0010\u0006\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/assets/options/main/OptionsAssetMainViewModel;", "Lcom/kubi/mvi/state/BaseStateVM;", "Lcom/kubi/assets/options/main/OptionsAssetMainContract$UiIntent;", "Lcom/kubi/assets/options/main/OptionsAssetMainContract$UIState;", "<init>", "()V", "initState", "getInitState", "()Lcom/kubi/assets/options/main/OptionsAssetMainContract$UIState;", "dispatchIntentOnIO", "", "intent", "(Lcom/kubi/assets/options/main/OptionsAssetMainContract$UiIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isOpenOptions", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class OptionsAssetMainViewModel extends BaseStateVM<OptionsAssetMainContract$UiIntent, UIState> {
    /* JADX INFO: renamed from: e */
    public static final UIState m18150e(OptionsAssetMainViewModel optionsAssetMainViewModel, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState.copy(Boolean.valueOf(optionsAssetMainViewModel.m18153o()));
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object dispatchIntentOnIO(@NotNull OptionsAssetMainContract$UiIntent optionsAssetMainContract$UiIntent, @NotNull Continuation<? super Unit> continuation) {
        if (!(optionsAssetMainContract$UiIntent instanceof OptionsAssetMainContract$UiIntent.RefreshOpenStatus)) {
            throw new NoWhenBranchMatchedException();
        }
        updateState(new Function1() { // from class: com.kubi.assets.options.main.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsAssetMainViewModel.m18150e(this.f18156b, (UIState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, 1, null);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m18153o() {
        return C27025c.m66566d(Boolean.valueOf(IUserService.a.get().d0().getHasMarginOption()));
    }
}
