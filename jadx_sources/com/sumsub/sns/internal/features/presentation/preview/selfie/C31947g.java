package com.sumsub.sns.internal.features.presentation.preview.selfie;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28404L;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.presentation.camera.video.C30765a;
import com.sumsub.sns.internal.features.presentation.camera.video.C30776i;
import com.sumsub.sns.internal.features.presentation.preview.AbstractC31475a;
import com.sumsub.sns.internal.log.AbstractC33294e;
import java.io.File;
import kotlinx.coroutines.C41696j;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.selfie.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;", "Lcom/sumsub/sns/internal/features/presentation/preview/a;", "Lcom/sumsub/sns/internal/features/presentation/preview/selfie/j;", "Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;", "<init>", "()V", "com/sumsub/sns/internal/features/presentation/preview/selfie/a", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSPreviewSelfieFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSPreviewSelfieFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/selfie/SNSPreviewSelfieFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,195:1\n106#2,15:196\n256#3,2:211\n1#4:213\n*S KotlinDebug\n*F\n+ 1 SNSPreviewSelfieFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/selfie/SNSPreviewSelfieFragment\n*L\n30#1:196,15\n121#1:211,2\n*E\n"})
public final class C31947g extends AbstractC31475a<C31950j, C31957q> {

    /* JADX INFO: renamed from: a */
    public final Lazy f64951a;

    /* JADX INFO: renamed from: b */
    public final C28404L f64952b;

    /* JADX INFO: renamed from: c */
    public final C28404L f64953c;

    /* JADX INFO: renamed from: d */
    public final C28404L f64954d;

    /* JADX INFO: renamed from: e */
    public final C28404L f64955e;

    /* JADX INFO: renamed from: f */
    public final C28404L f64956f;

    /* JADX INFO: renamed from: g */
    public final C28404L f64957g;

    /* JADX INFO: renamed from: h */
    public MediaController f64958h;

    /* JADX INFO: renamed from: i */
    public File f64959i;

    /* JADX INFO: renamed from: j */
    public final Runnable f64960j;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ KProperty[] f64950l = {AbstractC28118g.m69077a(C31947g.class, "gContent", "getGContent()Landroidx/constraintlayout/widget/Group;", 0), AbstractC28118g.m69077a(C31947g.class, "playerView", "getPlayerView()Landroid/widget/VideoView;", 0), AbstractC28118g.m69077a(C31947g.class, "tvTitle", "getTvTitle()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C31947g.class, "tvSubtitle", "getTvSubtitle()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C31947g.class, "btnReadableVideo", "getBtnReadableVideo()Landroid/widget/Button;", 0), AbstractC28118g.m69077a(C31947g.class, "btnTakeAnotherVideo", "getBtnTakeAnotherVideo()Landroid/widget/Button;", 0)};

    /* JADX INFO: renamed from: k */
    public static final C31941a f64949k = new C31941a();

    /* JADX INFO: renamed from: a */
    public static final void m70952a(C31947g c31947g) {
        MediaController mediaController = c31947g.f64958h;
        if (mediaController != null) {
            mediaController.show(2000);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final ViewModelProvider.Factory m70956b(C31947g c31947g) {
        Bundle arguments = c31947g.getArguments();
        return new C31958r(arguments != null ? (Document) arguments.getParcelable("ARGS_DOCUMENT") : null, c31947g, c31947g.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease(), c31947g.getArguments());
    }

    /* JADX INFO: renamed from: a */
    public static final void m70954a(C31947g c31947g, String str, Bundle bundle) {
        String string = bundle.getString("EXTRA_FILE");
        ((C31957q) c31947g.f64951a.getValue()).m70962a((string == null || string.length() == 0) ? null : new File(string), bundle.getString("EXTRA_PHRASE"));
    }

    /* JADX INFO: renamed from: b */
    public static final void m70957b(C31947g c31947g, View view) {
        C28367f.m69257a(c31947g.getAnalyticsDelegate(), c31947g.getF63626a(), c31947g.getF62316b(), Control.RetakeButton, null, 24);
        c31947g.m70959h();
        C31957q c31957q = (C31957q) c31947g.f64951a.getValue();
        c31957q.getClass();
        C41696j.m91104d(ViewModelKt.getViewModelScope(c31957q), null, null, new C31954n(c31957q, null), 3, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Integer getLayoutId() {
        return Integer.valueOf(R$layout.sns_fragment_preview_selfie);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C31957q) this.f64951a.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final void m70959h() {
        VideoView videoView = (VideoView) this.f64953c.getValue(this, f64950l[1]);
        if (videoView == null) {
            return;
        }
        if (videoView.isPlaying() || this.f64959i != null) {
            AbstractC31959s.m70965a("stopPlayback");
            this.f64959i = null;
            videoView.stopPlayback();
        }
    }

    @Override // com.sumsub.sns.internal.features.presentation.preview.AbstractC31475a, com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final void handleEvent(InterfaceC28145r interfaceC28145r) {
        AbstractC31959s.m70965a("handleEvent: " + interfaceC28145r);
        super.handleEvent(interfaceC28145r);
        if (interfaceC28145r instanceof C31948h) {
            C30765a c30765a = C30776i.f62172n;
            C31949i c31949i = ((C31948h) interfaceC28145r).f64961a;
            String str = c31949i.f64962a;
            String str2 = c31949i.f64963b;
            if (str2 == null) {
                str2 = "";
            }
            c30765a.getClass();
            C30776i c30776i = new C30776i();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_ID_DOC_SET_TYPE", str);
            bundle.putString("EXTRA_TYPE", str2);
            c30776i.setArguments(bundle);
            AbstractC28133l.navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(this, c30776i.forResult("video_selfie"), AbstractC33294e.m71624a(c30765a), false, 4, null);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final /* bridge */ /* synthetic */ void handleState(InterfaceC28147s interfaceC28147s, Bundle bundle) {
        m70958a((C31950j) interfaceC28147s);
    }

    public C31947g() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.selfie.y
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31947g.m70956b(this.f64996b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C31943c(new C31942b(this)));
        this.f64951a = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C31957q.class), new C31944d(lazy), new C31945e(lazy), function0);
        this.f64952b = new C28404L(R$id.sns_content);
        this.f64953c = new C28404L(R$id.sns_player);
        this.f64954d = new C28404L(R$id.sns_title);
        this.f64955e = new C28404L(R$id.sns_subtitle);
        this.f64956f = new C28404L(R$id.sns_primary_button);
        this.f64957g = new C28404L(R$id.sns_secondary_button);
        this.f64960j = new Runnable() { // from class: com.sumsub.sns.internal.features.presentation.preview.selfie.z
            @Override // java.lang.Runnable
            public final void run() {
                C31947g.m70952a(this.f64997b);
            }
        };
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getIdDocSetType */
    public final String getF62316b() {
        Document document;
        C29070X type;
        String str;
        Bundle arguments = getArguments();
        Document document2 = null;
        if (arguments != null) {
            document = (Document) arguments.getParcelable("ARGS_DOCUMENT");
        } else {
            document = null;
        }
        if (document != null) {
            document2 = document;
        }
        if (document2 != null && (type = document2.getType()) != null && (str = type.f59014a) != null) {
            return str;
        }
        return "TYPE_UNKNOWN";
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requireActivity().getSupportFragmentManager().setFragmentResultListener("video_selfie", this, new FragmentResultListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.selfie.x
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle2) {
                C31947g.m70954a(this.f64995a, str, bundle2);
            }
        });
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onStop() {
        AbstractC31959s.m70965a("onStop");
        m70959h();
        VideoView videoView = (VideoView) this.f64953c.getValue(this, f64950l[1]);
        if (videoView != null) {
            videoView.removeCallbacks(this.f64960j);
        }
        super.onStop();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28064I, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C28404L c28404l = this.f64956f;
        KProperty[] kPropertyArr = f64950l;
        Button button = (Button) c28404l.getValue(this, kPropertyArr[4]);
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.selfie.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C31947g.m70953a(this.f64948b, view2);
                }
            });
        }
        Button button2 = (Button) this.f64957g.getValue(this, kPropertyArr[5]);
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.selfie.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C31947g.m70957b(this.f64993b, view2);
                }
            });
        }
        final VideoView videoView = (VideoView) this.f64953c.getValue(this, kPropertyArr[1]);
        if (videoView != null) {
            MediaController mediaController = new MediaController(requireContext());
            this.f64958h = mediaController;
            videoView.setMediaController(mediaController);
            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.selfie.u
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer) {
                    C31947g.m70950a(mediaPlayer);
                }
            });
            videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.selfie.v
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    C31947g.m70951a(videoView, mediaPlayer);
                }
            });
            videoView.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.selfie.w
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer, int i11, int i12) {
                    return C31947g.m70955a(mediaPlayer, i11, i12);
                }
            });
            videoView.post(this.f64960j);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final void updatePoweredByVisibility(boolean z11) {
        int i11;
        View viewFindViewById = requireView().findViewById(R$id.sns_powered);
        if (viewFindViewById != null) {
            if (z11) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            viewFindViewById.setVisibility(i11);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m70953a(C31947g c31947g, View view) {
        C28367f.m69257a(c31947g.getAnalyticsDelegate(), c31947g.getF63626a(), c31947g.getF62316b(), Control.AcceptButton, null, 24);
        c31947g.m70959h();
        ((C31957q) c31947g.f64951a.getValue()).m70964f();
    }

    /* JADX INFO: renamed from: a */
    public static final void m70950a(MediaPlayer mediaPlayer) {
        AbstractC31959s.m70965a("playback completed: " + mediaPlayer);
    }

    /* JADX INFO: renamed from: a */
    public static final void m70951a(VideoView videoView, MediaPlayer mediaPlayer) {
        AbstractC31959s.m70965a("player prepared: " + mediaPlayer);
        mediaPlayer.setLooping(true);
        videoView.seekTo(0);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m70955a(MediaPlayer mediaPlayer, int i11, int i12) {
        AbstractC31959s.m70965a("player error: " + mediaPlayer + ", what=" + i11 + ", extra=" + i12);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m70958a(C31950j c31950j) {
        AbstractC31959s.m70965a("handleState: " + c31950j);
        C28404L c28404l = this.f64954d;
        KProperty[] kPropertyArr = f64950l;
        TextView textView = (TextView) c28404l.getValue(this, kPropertyArr[2]);
        if (textView != null) {
            AbstractC28458h.m69341a(textView, c31950j.f64965b);
        }
        TextView textView2 = (TextView) this.f64955e.getValue(this, kPropertyArr[3]);
        if (textView2 != null) {
            AbstractC28458h.m69341a(textView2, c31950j.f64966c);
        }
        Button button = (Button) this.f64956f.getValue(this, kPropertyArr[4]);
        if (button != null) {
            AbstractC28458h.m69341a(button, c31950j.f64967d);
        }
        Button button2 = (Button) this.f64957g.getValue(this, kPropertyArr[5]);
        if (button2 != null) {
            AbstractC28458h.m69341a(button2, c31950j.f64968e);
        }
        Group group = (Group) this.f64952b.getValue(this, kPropertyArr[0]);
        if (group != null) {
            group.setVisibility(c31950j.f64969f ? 0 : 8);
        }
        updatePoweredByVisibility(((C31957q) this.f64951a.getValue()).shouldHideLogo());
        if (!c31950j.f64969f || c31950j.f64964a == null) {
            m70959h();
        }
        File file = c31950j.f64964a;
        if (file != null) {
            m70959h();
        }
        if (Intrinsics.areEqual(this.f64959i, file) || file == null) {
            return;
        }
        this.f64959i = file;
        VideoView videoView = (VideoView) this.f64953c.getValue(this, kPropertyArr[1]);
        if (videoView == null) {
            return;
        }
        videoView.setVideoPath(file.getAbsolutePath());
        videoView.requestFocus();
    }
}
