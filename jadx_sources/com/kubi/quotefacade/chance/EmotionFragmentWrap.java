package com.kubi.quotefacade.chance;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.R$string;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.extensions.core.C27032f;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: EmotionFragmentWrap.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001c\u0010\u0013\u001a\u00020\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0016J\b\u0010\u0019\u001a\u00020\u0011H\u0002J\u0006\u0010\u001a\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/quotefacade/chance/EmotionFragmentWrap;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "containerId", "", "emotionFragment", "Lcom/kubi/quotefacade/chance/EmotionFragment;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "showEmotionDetailDialog", "map", "", "", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "showEmotionFragment", "releaseFlutterFragment", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEmotionFragmentWrap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmotionFragmentWrap.kt\ncom/kubi/quotefacade/chance/EmotionFragmentWrap\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n76#2,7:88\n1#3:95\n*S KotlinDebug\n*F\n+ 1 EmotionFragmentWrap.kt\ncom/kubi/quotefacade/chance/EmotionFragmentWrap\n*L\n41#1:88,7\n*E\n"})
public final class EmotionFragmentWrap extends BaseFragment {

    /* JADX INFO: renamed from: U */
    public final int f41637U = View.generateViewId();

    /* JADX INFO: renamed from: V */
    @Nullable
    public EmotionFragment f41638V;

    /* JADX INFO: renamed from: o3 */
    private final void m51037o3() {
        EmotionFragment emotionFragment = this.f41638V;
        if (emotionFragment == null || !emotionFragment.isAdded()) {
            EmotionFragment emotionFragmentNewInstance = EmotionFragment.f41636i0.newInstance("discover/emotionList");
            this.f41638V = emotionFragmentNewInstance;
            if (emotionFragmentNewInstance != null) {
                C27032f.m66625p(this, this.f41637U, emotionFragmentNewInstance, null, 4, null);
            }
        }
    }

    /* JADX INFO: renamed from: l3 */
    public final void m51038l3() {
        EmotionFragment emotionFragment = this.f41638V;
        if (emotionFragment == null || !emotionFragment.isAdded()) {
            return;
        }
        EmotionFragment emotionFragment2 = this.f41638V;
        if (emotionFragment2 != null) {
            C27032f.m66622m(this, emotionFragment2);
        }
        this.f41638V = null;
    }

    /* JADX INFO: renamed from: m3 */
    public final void m51039m3(Map<String, ? extends Object> map) {
        Object obj = map.get("title");
        Object obj2 = "";
        if (obj == null || !(obj instanceof String)) {
            obj = "";
        }
        Object obj3 = map.get("content");
        if (obj3 != null && (obj3 instanceof String)) {
            obj2 = obj3;
        }
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4((String) obj).m54156M4((CharSequence) obj2).m54162S4(R$string.i_already_know, new DialogInterface.OnClickListener() { // from class: com.kubi.quotefacade.chance.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                EmotionFragmentWrap.m51036n3(dialogInterface, i11);
            }
        }).m54172c5(getChildFragmentManager());
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(inflater.getContext());
        frameLayout.setId(this.f41637U);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (C12573b.f21598a.m23696a()) {
            "emotion_dialog_controller".length();
        }
        C12572a.m23692a(this, false, new C21850xaf7b328b("emotion_dialog_controller", null, this));
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m51037o3();
    }

    /* JADX INFO: renamed from: n3 */
    public static final void m51036n3(DialogInterface dialogInterface, int i11) {
    }
}
