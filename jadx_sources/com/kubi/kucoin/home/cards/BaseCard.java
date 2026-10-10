package com.kubi.kucoin.home.cards;

import android.os.Bundle;
import android.view.View;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BaseCard.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/kucoin/home/cards/BaseCard;", "Lcom/kubi/kucoin/home/cards/BaseCardFragment;", "Lcom/kubi/kucoin/home/cards/ICard;", "<init>", "()V", "data", "Lcom/kubi/kucoin/home/cards/BaseCardData;", "getData", "()Lcom/kubi/kucoin/home/cards/BaseCardData;", "setData", "(Lcom/kubi/kucoin/home/cards/BaseCardData;)V", "bindData", "", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBaseCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCard.kt\ncom/kubi/kucoin/home/cards/BaseCard\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n1#2:30\n*E\n"})
public abstract class BaseCard extends BaseCardFragment implements ICard {

    /* JADX INFO: renamed from: U */
    @Nullable
    public BaseCardData f27849U;

    /* JADX INFO: renamed from: d3 */
    public final void m32166d3(@NotNull BaseCardData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f27849U = data;
        View view = getView();
        if (view != null) {
            if (isDetached()) {
                view = null;
            }
            if (view != null) {
                mo28980K1(data);
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final BaseCardData getF27849U() {
        return this.f27849U;
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseCardData baseCardData = this.f27849U;
        if (baseCardData != null) {
            mo28980K1(baseCardData);
        }
    }
}
