package com.kubi.kucoin.home.p090v2.cards;

import android.os.Bundle;
import android.view.View;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BaseCardV2.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u000eJ\u001a\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/kucoin/home/v2/cards/BaseCardV2;", "Lcom/kubi/kucoin/home/v2/cards/BaseCardFragmentV2;", "Lcom/kubi/kucoin/home/v2/cards/ICardV2;", "<init>", "()V", "data", "Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "getData", "()Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "setData", "(Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;)V", "bindData", "", "isUpdate", "", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBaseCardV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCardV2.kt\ncom/kubi/kucoin/home/v2/cards/BaseCardV2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,30:1\n1#2:31\n*E\n"})
public abstract class BaseCardV2 extends BaseCardFragmentV2 implements ICardV2 {

    /* JADX INFO: renamed from: U */
    @Nullable
    public BaseCardDataV2 f27909U;

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ void m32238e3(BaseCardV2 baseCardV2, BaseCardDataV2 baseCardDataV2, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindData");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        baseCardV2.m32239d3(baseCardDataV2, z11);
    }

    /* JADX INFO: renamed from: d3 */
    public final void m32239d3(@NotNull BaseCardDataV2 data, boolean z11) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f27909U = data;
        View view = getView();
        if (view != null) {
            if (isDetached()) {
                view = null;
            }
            if (view != null) {
                mo30081q(data, z11);
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: f3, reason: from getter */
    public final BaseCardDataV2 getF27909U() {
        return this.f27909U;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseCardDataV2 baseCardDataV2 = this.f27909U;
        if (baseCardDataV2 != null) {
            ICardV2.m32264x2(this, baseCardDataV2, false, 2, null);
        }
    }
}
