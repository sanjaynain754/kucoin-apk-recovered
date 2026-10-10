package com.kubi.home.v2.biz.empty;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.home.R$id;
import com.kubi.kucoin.home.p090v2.cards.BaseCardV2;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BottomGapCard.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0014J$\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/home/v2/biz/empty/BottomGapCard;", "Lcom/kubi/kucoin/home/v2/cards/BaseCardV2;", "<init>", "()V", "rootView", "Landroid/view/View;", "getLayout", "", "onCustomCreateView", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "bindFlowEvent", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBottomGapCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomGapCard.kt\ncom/kubi/home/v2/biz/empty/BottomGapCard\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,55:1\n76#2,7:56\n*S KotlinDebug\n*F\n+ 1 BottomGapCard.kt\ncom/kubi/home/v2/biz/empty/BottomGapCard\n*L\n44#1:56,7\n*E\n"})
public final class BottomGapCard extends BaseCardV2 {

    /* JADX INFO: renamed from: V */
    @Nullable
    public View f26373V;

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public int getLayout() {
        return 0;
    }

    private final void bindFlowEvent() {
        if (C12573b.f21598a.m23696a()) {
            "com.kubi.home.event.HomeEvent:home_show_home_add_card_dialog".length();
        }
        C12572a.m23692a(this, false, new BottomGapCard$bindFlowEvent$$inlined$bindFlowEvent$default$1("com.kubi.home.event.HomeEvent:home_show_home_add_card_dialog", null, this));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    @NotNull
    public View onCustomCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(inflater.getContext());
        frameLayout.setId(R$id.home_card_bottom_gap_card);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
        this.f26373V = frameLayout;
        return frameLayout;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardV2, com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        bindFlowEvent();
    }
}
