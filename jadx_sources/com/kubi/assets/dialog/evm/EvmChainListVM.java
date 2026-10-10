package com.kubi.assets.dialog.evm;

import androidx.lifecycle.ViewModelKt;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import p228eb.AbstractC37127a;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EvmChainListVM.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\nH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/assets/dialog/evm/EvmChainListVM;", "Lcom/kubi/assets/mvi/BaseMviViewModel;", "Lcom/kubi/assets/dialog/evm/EvmChainListIntent;", "Lcom/kubi/assets/dialog/evm/EvmChainListState;", "Lcom/kubi/assets/dialog/evm/EvmChainListEffect;", "<init>", "()V", "repo", "Lcom/kubi/assets/dialog/evm/EvmRepo;", "dispatch", "", "intent", "loadEvmChainList", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class EvmChainListVM extends AbstractC37127a<EvmChainListIntent, EvmChainListState, EvmChainListEffect> {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final EvmRepo f17041Z;

    public EvmChainListVM() {
        super(new EvmChainListState(false, null, null, 7, null));
        this.f17041Z = EvmRepo.f17055a;
    }

    /* JADX INFO: renamed from: u */
    public void m16218u(@NotNull EvmChainListIntent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (!(intent instanceof EvmChainListIntent.a)) {
            throw new NoWhenBranchMatchedException();
        }
        m16219v();
    }

    /* JADX INFO: renamed from: v */
    public final void m16219v() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new EvmChainListVM$loadEvmChainList$1(this, null), 3, null);
    }
}
