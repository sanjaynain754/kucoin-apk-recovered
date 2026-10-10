package com.sumsub.sns.internal.features.presentation.preview.photo;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.data.listener.SNSEvent;
import com.sumsub.sns.core.data.listener.SNSEventHandler;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.widget.SNSImageView;
import com.sumsub.sns.core.widget.SNSRotationZoomableImageView;
import com.sumsub.sns.internal.core.analytics.Block;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28495t0;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.C28404L;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.common.InterfaceC28498u0;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.core.presentation.theme.C28955c;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import com.sumsub.sns.internal.features.data.model.common.C29015J;
import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.C29697t2;
import com.sumsub.sns.internal.features.domain.documents.AbstractC30108B;
import com.sumsub.sns.internal.features.domain.documents.AbstractC30146q;
import com.sumsub.sns.internal.features.domain.documents.C30107A;
import com.sumsub.sns.internal.features.domain.documents.C30119M;
import com.sumsub.sns.internal.features.domain.documents.C30120N;
import com.sumsub.sns.internal.features.domain.documents.C30127V;
import com.sumsub.sns.internal.features.domain.documents.C30152w;
import com.sumsub.sns.internal.features.domain.documents.C30154y;
import com.sumsub.sns.internal.features.presentation.camera.photo.document.C30468J;
import com.sumsub.sns.internal.features.presentation.camera.photo.document.C30654y;
import com.sumsub.sns.internal.features.presentation.camera.photo.selfie.C30716l;
import com.sumsub.sns.internal.features.presentation.camera.photo.selfie.C30717m;
import com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2;
import com.sumsub.sns.internal.features.presentation.main.SNSAppActivity;
import com.sumsub.sns.internal.features.presentation.preview.AbstractC31475a;
import com.sumsub.sns.internal.features.presentation.preview.C31509b;
import com.sumsub.sns.internal.features.presentation.preview.photo.AbstractC31770c0;
import com.sumsub.sns.internal.features.presentation.preview.photo.util.C31935c;
import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import com.sumsub.sns.internal.features.presentation.utils.C32637O;
import com.sumsub.sns.internal.features.presentation.utils.C32638P;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.C33048a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/preview/photo/m;", "Lcom/sumsub/sns/internal/features/presentation/preview/photo/c0;", "VM", "Lcom/sumsub/sns/internal/features/presentation/preview/a;", "Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSPreviewPhotoDocumentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSPreviewPhotoDocumentFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/photo/SNSPreviewPhotoDocumentFragment\n+ 2 ViewThemeExtensions.kt\ncom/sumsub/sns/core/presentation/helper/ViewThemeExtensionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 SNSPreviewPhotoDocumentViewModelExt.kt\ncom/sumsub/sns/internal/features/presentation/preview/photo/util/SNSPreviewPhotoDocumentViewModelExtKt\n+ 5 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 6 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,586:1\n37#2:587\n37#2:588\n256#3,2:589\n277#3,2:591\n277#3,2:593\n256#3,2:595\n256#3,2:597\n256#3,2:599\n277#3,2:601\n256#3,2:603\n256#3,2:605\n277#3,2:607\n277#3,2:609\n256#3,2:636\n81#3:638\n277#3,2:646\n256#3,2:648\n81#3:650\n16#4,2:611\n18#4,5:618\n17#5:613\n19#5:617\n46#6:614\n51#6:616\n105#7:615\n1617#8,9:623\n1869#8:632\n1870#8:634\n1626#8:635\n774#8:639\n865#8,2:640\n1563#8:642\n1634#8,3:643\n1#9:633\n*S KotlinDebug\n*F\n+ 1 SNSPreviewPhotoDocumentFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/photo/SNSPreviewPhotoDocumentFragment\n*L\n161#1:587\n164#1:588\n309#1:589,2\n316#1:591,2\n317#1:593,2\n328#1:595,2\n336#1:597,2\n343#1:599,2\n346#1:601,2\n347#1:603,2\n354#1:605,2\n357#1:607,2\n358#1:609,2\n382#1:636,2\n391#1:638\n457#1:646,2\n529#1:648,2\n560#1:650\n377#1:611,2\n377#1:618,5\n377#1:613\n377#1:617\n377#1:614\n377#1:616\n377#1:615\n381#1:623,9\n381#1:632\n381#1:634\n381#1:635\n395#1:639\n395#1:640,2\n395#1:642\n395#1:643,3\n381#1:633\n*E\n"})
public abstract class AbstractC31826m<VM extends AbstractC31770c0> extends AbstractC31475a<C31931t, VM> {

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ KProperty[] f64666t = {AbstractC28118g.m69077a(AbstractC31826m.class, "photosPager", "getPhotosPager()Landroidx/viewpager2/widget/ViewPager2;", 0), AbstractC28118g.m69077a(AbstractC31826m.class, "ivPhoto", "getIvPhoto()Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;", 0), AbstractC28118g.m69077a(AbstractC31826m.class, "uploadProgress", "getUploadProgress()Lcom/google/android/material/progressindicator/LinearProgressIndicator;", 0), AbstractC28118g.m69077a(AbstractC31826m.class, "btnSecondary", "getBtnSecondary()Landroid/widget/Button;", 0), AbstractC28118g.m69077a(AbstractC31826m.class, "ivContentIcon", "getIvContentIcon()Lcom/sumsub/sns/core/widget/SNSImageView;", 0), AbstractC28118g.m69077a(AbstractC31826m.class, "tvTitle", "getTvTitle()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(AbstractC31826m.class, "tvSubtitle", "getTvSubtitle()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(AbstractC31826m.class, "tvIdDoc", "getTvIdDoc()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(AbstractC31826m.class, "vgWarning", "getVgWarning()Landroid/view/ViewGroup;", 0), AbstractC28118g.m69077a(AbstractC31826m.class, "btnRotateCW", "getBtnRotateCW()Landroid/widget/ImageButton;", 0), AbstractC28118g.m69077a(AbstractC31826m.class, "btnRotateCCW", "getBtnRotateCCW()Landroid/widget/ImageButton;", 0), AbstractC28118g.m69077a(AbstractC31826m.class, "gContent", "getGContent()Landroidx/constraintlayout/widget/Group;", 0), AbstractC28118g.m69077a(AbstractC31826m.class, "btnPrimary", "getBtnPrimary()Landroid/widget/Button;", 0)};

    /* JADX INFO: renamed from: b */
    public C31769c f64668b;

    /* JADX INFO: renamed from: p */
    public BottomSheetBehavior f64682p;

    /* JADX INFO: renamed from: q */
    public InterfaceC41775x1 f64683q;

    /* JADX INFO: renamed from: r */
    public int f64684r;

    /* JADX INFO: renamed from: s */
    public C31932u f64685s;

    /* JADX INFO: renamed from: a */
    public final C28404L f64667a = new C28404L(R$id.sns_photos);

    /* JADX INFO: renamed from: c */
    public final C28404L f64669c = new C28404L(R$id.sns_photo);

    /* JADX INFO: renamed from: d */
    public final C28404L f64670d = new C28404L(R$id.sns_upload_progress);

    /* JADX INFO: renamed from: e */
    public final C28404L f64671e = new C28404L(R$id.sns_secondary_button);

    /* JADX INFO: renamed from: f */
    public final C28404L f64672f = new C28404L(R$id.sns_content_icon);

    /* JADX INFO: renamed from: g */
    public final C28404L f64673g = new C28404L(R$id.sns_title);

    /* JADX INFO: renamed from: h */
    public final C28404L f64674h = new C28404L(R$id.sns_subtitle);

    /* JADX INFO: renamed from: i */
    public final C28404L f64675i = new C28404L(R$id.sns_iddoc);

    /* JADX INFO: renamed from: j */
    public final C28404L f64676j = new C28404L(R$id.sns_warning);

    /* JADX INFO: renamed from: k */
    public final C28404L f64677k = new C28404L(R$id.sns_rotate_cw);

    /* JADX INFO: renamed from: l */
    public final C28404L f64678l = new C28404L(R$id.sns_rotate_ccw);

    /* JADX INFO: renamed from: m */
    public final C28404L f64679m = new C28404L(R$id.sns_content);

    /* JADX INFO: renamed from: n */
    public final C28404L f64680n = new C28404L(R$id.sns_primary_button);

    /* JADX INFO: renamed from: o */
    public final C32637O f64681o = new C32637O(this, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.l0
        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return AbstractC31826m.m70891a(this.f64665b, ((Boolean) obj).booleanValue());
        }
    });

    /* JADX INFO: renamed from: a */
    public static final Unit m70890a(AbstractC31826m abstractC31826m, int i11, C31767b c31767b) {
        File file = c31767b.f64551b;
        if (file == null) {
            return Unit.INSTANCE;
        }
        InterfaceC28498u0 appListener$idensic_mobile_sdk_aar_defaultRelease = abstractC31826m.getAppListener$idensic_mobile_sdk_aar_defaultRelease();
        if (appListener$idensic_mobile_sdk_aar_defaultRelease != null) {
            AbstractC28495t0.m69386a(appListener$idensic_mobile_sdk_aar_defaultRelease, file, c31767b.f64552c, abstractC31826m.getF66531c(), null, null, 48);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static final void m70897b(AbstractC31826m abstractC31826m, View view) {
        C28367f.m69257a(abstractC31826m.getAnalyticsDelegate(), abstractC31826m.getF65153b(), abstractC31826m.getF66531c(), Control.RotateButton, ((AbstractC31770c0) abstractC31826m.getViewModel$idensic_mobile_sdk_aar_defaultRelease()).m70868e(), 16);
        abstractC31826m.m70905a(false);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Integer getLayoutId() {
        return Integer.valueOf(R$layout.sns_fragment_preview_photo_document);
    }

    /* JADX INFO: renamed from: h */
    public final ViewPager2 m70906h() {
        return (ViewPager2) this.f64667a.getValue(this, f64666t[0]);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final /* bridge */ /* synthetic */ void handleState(InterfaceC28147s interfaceC28147s, Bundle bundle) {
        m70903a((C31931t) interfaceC28147s);
    }

    /* JADX INFO: renamed from: i */
    public final TextView m70907i() {
        return (TextView) this.f64674h.getValue(this, f64666t[6]);
    }

    /* JADX INFO: renamed from: j */
    public final ViewGroup m70908j() {
        return (ViewGroup) this.f64676j.getValue(this, f64666t[8]);
    }

    /* JADX INFO: renamed from: k */
    public final void m70909k() {
        InterfaceC41775x1 interfaceC41775x1 = this.f64683q;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f64683q = C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C31789f(this, null), 3, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public boolean onFinishCalled(AbstractC28503w abstractC28503w) {
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "finishing preview screen r=" + abstractC28503w, null);
        ((AbstractC31770c0) getViewModel$idensic_mobile_sdk_aar_defaultRelease()).f64559h.m71254g();
        m69084e();
        return true;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Map getClosePayload() {
        return ((AbstractC31770c0) getViewModel$idensic_mobile_sdk_aar_defaultRelease()).m70868e();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Map getOpenPayload() {
        return ((AbstractC31770c0) getViewModel$idensic_mobile_sdk_aar_defaultRelease()).m70868e();
    }

    @Override // com.sumsub.sns.internal.features.presentation.preview.AbstractC31475a, com.sumsub.sns.core.presentation.base.AbstractC28133l
    public void handleEvent(InterfaceC28145r interfaceC28145r) {
        AbstractC28133l c30716l;
        super.handleEvent(interfaceC28145r);
        if (interfaceC28145r instanceof C32638P) {
            if (isAdded()) {
                this.f64681o.mo69598p();
                return;
            }
            return;
        }
        if (interfaceC28145r instanceof C30154y) {
            C30654y c30654y = C30468J.f61431o;
            C30119M c30119m = ((C30154y) interfaceC28145r).f60596a;
            c30654y.getClass();
            AbstractC28133l.navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(this, C30654y.m70415a(c30119m).forResult("request_photo_picker"), "SNSPhotoDocumentPickerFragment2", false, 4, null);
            return;
        }
        if (interfaceC28145r instanceof C30107A) {
            C30107A c30107a = (C30107A) interfaceC28145r;
            C29070X type = c30107a.f60541a.f60551b.getType();
            C30119M c30119m2 = c30107a.f60541a;
            boolean z11 = c30119m2.f60553d;
            String str = c30119m2.f60557h;
            if (!C33048a.f67488u.m71434a()) {
                C30717m.f62052v.getClass();
                c30716l = new C30717m();
                Bundle bundle = new Bundle();
                bundle.putString("EXTRA_DOCUMENT_TYPE", type.f59014a);
                bundle.putBoolean("EXTRA_GALLERY_AVAILABLE", z11);
                if (str != null) {
                    bundle.putString("EXTRA_COUNTRY_CODE", str);
                }
                c30716l.setArguments(bundle);
            } else {
                c30716l = new C30716l();
                Bundle bundle2 = new Bundle();
                bundle2.putString("EXTRA_DOCUMENT_TYPE", type.f59014a);
                bundle2.putBoolean("EXTRA_GALLERY_AVAILABLE", z11);
                if (str != null) {
                    bundle2.putString("EXTRA_COUNTRY_CODE", str);
                }
                c30716l.setArguments(bundle2);
            }
            AbstractC28133l.navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(this, c30716l.forResult("request_photo_picker"), "SNSSelfieWithDocPicker2", false, 4, null);
            return;
        }
        if (interfaceC28145r instanceof AbstractC31930s) {
            AbstractC31930s abstractC31930s = (AbstractC31930s) interfaceC28145r;
            if (abstractC31930s instanceof C31929r) {
                Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "Skipping NFC", null, 4, null);
                InterfaceC28498u0 appListener$idensic_mobile_sdk_aar_defaultRelease = getAppListener$idensic_mobile_sdk_aar_defaultRelease();
                if (appListener$idensic_mobile_sdk_aar_defaultRelease != null) {
                    ((SNSAppActivity) appListener$idensic_mobile_sdk_aar_defaultRelease).m70608a(((C31929r) interfaceC28145r).f64908a);
                    return;
                }
                return;
            }
            if (abstractC31930s instanceof C31928q) {
                InterfaceC28498u0 appListener$idensic_mobile_sdk_aar_defaultRelease2 = getAppListener$idensic_mobile_sdk_aar_defaultRelease();
                if (appListener$idensic_mobile_sdk_aar_defaultRelease2 != null) {
                    ((SNSAppActivity) appListener$idensic_mobile_sdk_aar_defaultRelease2).m70607a(((C31928q) interfaceC28145r).f64907a);
                    return;
                }
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (interfaceC28145r instanceof C30120N) {
            C30120N c30120n = (C30120N) interfaceC28145r;
            C29697t2 c29697t2 = c30120n.f60559a;
            AbstractC30108B abstractC30108B = c30120n.f60560b;
            InterfaceC28498u0 appListener$idensic_mobile_sdk_aar_defaultRelease3 = getAppListener$idensic_mobile_sdk_aar_defaultRelease();
            if (appListener$idensic_mobile_sdk_aar_defaultRelease3 != null) {
                ((AbstractC31275i2) ((SNSAppActivity) appListener$idensic_mobile_sdk_aar_defaultRelease3).f63147e.getValue()).mo70624a(c29697t2, abstractC30108B, m70473f());
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28064I, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f64682p = null;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("current_page", this.f64684r);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28064I, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SNSCustomizationTheme theme;
        C28966p c28966p;
        SNSCustomizationTheme theme2;
        C28966p c28966p2;
        C28955c c28955c;
        Integer num;
        C28955c c28955c2;
        super.onViewCreated(view, bundle);
        ViewPager2 viewPager2M70906h = m70906h();
        if (viewPager2M70906h != null) {
            viewPager2M70906h.setOffscreenPageLimit(2);
        }
        ViewPager2 viewPager2M70906h2 = m70906h();
        if (viewPager2M70906h2 != null) {
            viewPager2M70906h2.registerOnPageChangeCallback(new C31791g(this));
        }
        C31769c c31769c = new C31769c();
        c31769c.f64556b = new Function2() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.i0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AbstractC31826m.m70890a(this.f64606b, ((Integer) obj).intValue(), (C31767b) obj2);
            }
        };
        this.f64668b = c31769c;
        ViewPager2 viewPager2M70906h3 = m70906h();
        if (viewPager2M70906h3 != null) {
            viewPager2M70906h3.setAdapter(this.f64668b);
        }
        if (bundle != null) {
            this.f64684r = bundle.getInt("current_page", 0);
        }
        C28404L c28404l = this.f64677k;
        KProperty[] kPropertyArr = f64666t;
        ImageButton imageButton = (ImageButton) c28404l.getValue(this, kPropertyArr[9]);
        if (imageButton != null) {
            imageButton.setVisibility(4);
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.j0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AbstractC31826m.m70893a(this.f64660b, view2);
                }
            });
            imageButton.setImageDrawable(C28468k0.f57983a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSCommonIcons.ROTATE_CW.getImageName()));
        }
        ImageButton imageButton2 = (ImageButton) this.f64678l.getValue(this, kPropertyArr[10]);
        if (imageButton2 != null) {
            imageButton2.setVisibility(4);
            imageButton2.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AbstractC31826m.m70897b(this.f64662b, view2);
                }
            });
            imageButton2.setImageDrawable(C28468k0.f57983a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSCommonIcons.ROTATE_CCW.getImageName()));
        }
        TextView textView = (TextView) this.f64675i.getValue(this, kPropertyArr[7]);
        if (textView != null) {
            textView.setVisibility(8);
        }
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) this.f64670d.getValue(this, kPropertyArr[2]);
        if (linearProgressIndicator != null) {
            SNSColorElement sNSColorElement = SNSColorElement.PROGRESS_BAR_TINT;
            C28468k0 c28468k0 = C28468k0.f57983a;
            SNSJsonCustomization customization = c28468k0.getCustomization();
            Integer num2 = null;
            if (customization != null) {
                theme = customization.getTheme();
            } else {
                theme = null;
            }
            if (theme instanceof C28966p) {
                c28966p = (C28966p) theme;
            } else {
                c28966p = null;
            }
            if (c28966p != null) {
                boolean zM69346a = AbstractC28458h.m69346a(linearProgressIndicator.getResources().getConfiguration());
                Map map = c28966p.f58877c;
                if (map != null && (c28955c2 = (C28955c) map.get(sNSColorElement.getValue())) != null) {
                    if (zM69346a) {
                        num = c28955c2.f58858a;
                    } else {
                        num = c28955c2.f58859b;
                    }
                } else {
                    num = null;
                }
                if (num != null) {
                    linearProgressIndicator.setIndicatorColor(num.intValue(), 0);
                }
            }
            SNSColorElement sNSColorElement2 = SNSColorElement.PROGRESS_BAR_BACKGROUND;
            SNSJsonCustomization customization2 = c28468k0.getCustomization();
            if (customization2 != null) {
                theme2 = customization2.getTheme();
            } else {
                theme2 = null;
            }
            if (theme2 instanceof C28966p) {
                c28966p2 = (C28966p) theme2;
            } else {
                c28966p2 = null;
            }
            if (c28966p2 != null) {
                boolean zM69346a2 = AbstractC28458h.m69346a(linearProgressIndicator.getResources().getConfiguration());
                Map map2 = c28966p2.f58877c;
                if (map2 != null && (c28955c = (C28955c) map2.get(sNSColorElement2.getValue())) != null) {
                    num2 = zM69346a2 ? c28955c.f58858a : c28955c.f58859b;
                }
                if (num2 != null) {
                    linearProgressIndicator.setTrackColor(num2.intValue());
                }
            }
        }
        ViewGroup viewGroupM70908j = m70908j();
        if (viewGroupM70908j == null) {
            return;
        }
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewGroupM70908j);
        bottomSheetBehaviorFrom.addBottomSheetCallback(new C31793h(this));
        this.f64682p = bottomSheetBehaviorFrom;
        m70909k();
    }

    @Override // com.sumsub.sns.internal.features.presentation.common.AbstractC30809H, com.sumsub.sns.core.presentation.base.AbstractC28064I
    public void onViewModelPrepared(Bundle bundle) {
        super.onViewModelPrepared(bundle);
        requireActivity().getSupportFragmentManager().setFragmentResultListener("request_image_rotation", this, new FragmentResultListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.g0
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle2) {
                AbstractC31826m.m70896a(this.f64601a, str, bundle2);
            }
        });
        requireActivity().getSupportFragmentManager().setFragmentResultListener("request_photo_picker", this, new FragmentResultListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.h0
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle2) {
                AbstractC31826m.m70900b(this.f64603a, str, bundle2);
            }
        });
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final void trackOpen() {
        AbstractC31770c0 abstractC31770c0 = (AbstractC31770c0) getViewModel$idensic_mobile_sdk_aar_defaultRelease();
        AbstractC28421U.m69305b(C41636g.m90918h0(new C31935c(abstractC31770c0.getViewState()), 1), getViewLifecycleOwner(), new C31822k(this, null));
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final void updatePoweredByVisibility(boolean z11) {
        int i11;
        TextView poweredByText = getPoweredByText();
        int i12 = 0;
        if (poweredByText != null) {
            if (z11) {
                i11 = 4;
            } else {
                i11 = 0;
            }
            poweredByText.setVisibility(i11);
        }
        View viewFindViewById = requireView().findViewById(R$id.sns_powered);
        if (viewFindViewById != null) {
            if (z11) {
                i12 = 8;
            }
            viewFindViewById.setVisibility(i12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m70900b(AbstractC31826m abstractC31826m, String str, Bundle bundle) {
        C30127V c30127v = (C30127V) bundle.getParcelable("DOCUMENT_UPLOAD_RESULT");
        if (c30127v != null) {
            AbstractC31770c0 abstractC31770c0 = (AbstractC31770c0) abstractC31826m.getViewModel$idensic_mobile_sdk_aar_defaultRelease();
            AbstractC30146q abstractC30146q = c30127v.f60566b;
            List list = c30127v.f60565a;
            abstractC31770c0.getClass();
            C41696j.m91104d(ViewModelKt.getViewModelScope(abstractC31770c0), null, null, new C31753N(abstractC30146q, abstractC31770c0, list, null), 3, null);
            return;
        }
        C29054T c29054t = (C29054T) bundle.getParcelable("DOCUMENT_RESULT");
        C29015J c29015j = (C29015J) bundle.getParcelable("DOCUMENT_RESULTS");
        Logger.DefaultImpls.v$default(C33272c.f67812a, AbstractC33294e.m71624a(abstractC31826m), "On photo pick result: " + c29054t, null, 4, null);
        AbstractC28133l.Companion.getClass();
        if (bundle.getInt(AbstractC28133l.FRAGMENT_RESULT_KEY) != -1) {
            if (bundle.getInt(AbstractC28133l.FRAGMENT_RESULT_KEY) == 100) {
                AbstractC31770c0 abstractC31770c1 = (AbstractC31770c0) abstractC31826m.getViewModel$idensic_mobile_sdk_aar_defaultRelease();
                abstractC31770c1.getClass();
                C41696j.m91104d(ViewModelKt.getViewModelScope(abstractC31770c1), null, null, new C31758T(abstractC31770c1, null), 3, null);
                return;
            }
            abstractC31826m.mo70873l();
            return;
        }
        if (c29015j != null) {
            AbstractC31770c0 abstractC31770c2 = (AbstractC31770c0) abstractC31826m.getViewModel$idensic_mobile_sdk_aar_defaultRelease();
            abstractC31770c2.getClass();
            C41696j.m91104d(ViewModelKt.getViewModelScope(abstractC31770c2), null, null, new C31747H(abstractC31770c2, c29015j, null), 3, null);
        } else {
            AbstractC31770c0 abstractC31770c3 = (AbstractC31770c0) abstractC31826m.getViewModel$idensic_mobile_sdk_aar_defaultRelease();
            abstractC31770c3.getClass();
            C41696j.m91104d(ViewModelKt.getViewModelScope(abstractC31770c3), null, null, new C31745F(abstractC31770c3, c29054t, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70891a(AbstractC31826m abstractC31826m, boolean z11) {
        ((AbstractC31770c0) abstractC31826m.getViewModel$idensic_mobile_sdk_aar_defaultRelease()).m70867d(z11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final void m70893a(AbstractC31826m abstractC31826m, View view) {
        C28367f.m69257a(abstractC31826m.getAnalyticsDelegate(), abstractC31826m.getF65153b(), abstractC31826m.getF66531c(), Control.RotateButton, ((AbstractC31770c0) abstractC31826m.getViewModel$idensic_mobile_sdk_aar_defaultRelease()).m70868e(), 16);
        abstractC31826m.m70905a(true);
    }

    /* JADX INFO: renamed from: l */
    public void mo70873l() {
    }

    /* JADX INFO: renamed from: a */
    public final void m70905a(boolean z11) {
        ViewPager2 viewPager2M70906h;
        SNSRotationZoomableImageView sNSRotationZoomableImageView;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        ViewPager2 viewPager2M70906h2 = m70906h();
        if (viewPager2M70906h2 != null) {
            int currentItem = viewPager2M70906h2.getCurrentItem();
            C31769c c31769c = this.f64668b;
            if (c31769c == null || (viewPager2M70906h = m70906h()) == null) {
                return;
            }
            int currentItem2 = viewPager2M70906h.getCurrentItem();
            View childAt = viewPager2M70906h.getChildAt(0);
            RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
            View view = (recyclerView == null || (viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(currentItem2)) == null) ? null : viewHolderFindViewHolderForAdapterPosition.itemView;
            if (view == null || (sNSRotationZoomableImageView = (SNSRotationZoomableImageView) view.findViewById(R$id.sns_photo)) == null) {
                return;
            }
            if (z11) {
                sNSRotationZoomableImageView.rotateCW();
            } else {
                sNSRotationZoomableImageView.rotateCCW();
            }
            File file = ((C31767b) c31769c.f64555a.get(currentItem)).f64551b;
            if (file == null) {
                return;
            }
            AbstractC31770c0 abstractC31770c0 = (AbstractC31770c0) getViewModel$idensic_mobile_sdk_aar_defaultRelease();
            int rotation = sNSRotationZoomableImageView.getRotation();
            abstractC31770c0.f64559h.m71238a(rotation, file);
            AbstractC28073M0.updateState$default(abstractC31770c0, false, new C31755P(file, rotation, abstractC31770c0, null), 1, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m70899b(AbstractC31826m abstractC31826m, C31932u c31932u, View view) {
        abstractC31826m.m70909k();
        if (c31932u.f64917d) {
            return;
        }
        AbstractC31770c0 abstractC31770c0 = (AbstractC31770c0) abstractC31826m.getViewModel$idensic_mobile_sdk_aar_defaultRelease();
        abstractC31770c0.getClass();
        C41696j.m91104d(ViewModelKt.getViewModelScope(abstractC31770c0), null, null, new C31758T(abstractC31770c0, null), 3, null);
    }

    /* JADX INFO: renamed from: b */
    public static final void m70898b(AbstractC31826m abstractC31826m, C31916p c31916p, View view) {
        C31913n c31913n;
        abstractC31826m.m70902a((c31916p == null || (c31913n = c31916p.f64882d) == null) ? null : c31913n.f64873a);
    }

    @Override // com.sumsub.sns.internal.features.presentation.common.AbstractC30809H
    /* JADX INFO: renamed from: a */
    public final void mo70472a(boolean z11, Parcelable parcelable) {
        ((AbstractC31770c0) getViewModel$idensic_mobile_sdk_aar_defaultRelease()).mo70862a(z11, parcelable);
    }

    /* JADX INFO: renamed from: a */
    public static final void m70896a(AbstractC31826m abstractC31826m, String str, Bundle bundle) {
        int i11 = bundle.getInt("rotation", 0);
        File file = (File) bundle.getSerializable("file");
        if (file == null) {
            return;
        }
        AbstractC31770c0 abstractC31770c0 = (AbstractC31770c0) abstractC31826m.getViewModel$idensic_mobile_sdk_aar_defaultRelease();
        abstractC31770c0.f64559h.m71238a(i11, file);
        AbstractC28073M0.updateState$default(abstractC31770c0, false, new C31755P(file, i11, abstractC31770c0, null), 1, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m70901a(int i11) {
        ViewPager2 viewPager2M70906h = m70906h();
        if (viewPager2M70906h == null) {
            return;
        }
        int itemDecorationCount = viewPager2M70906h.getItemDecorationCount();
        for (int i12 = 0; i12 < itemDecorationCount; i12++) {
            viewPager2M70906h.removeItemDecorationAt(0);
        }
        viewPager2M70906h.addItemDecoration(new C31765a(getResources().getDimensionPixelSize(R$dimen.sns_margin_medium)));
        int dimensionPixelSize = i11 > 1 ? getResources().getDimensionPixelSize(R$dimen.sns_margin_large) : 0;
        View childAt = viewPager2M70906h.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setClipToPadding(false);
            recyclerView.setPadding(dimensionPixelSize, recyclerView.getPaddingTop(), dimensionPixelSize, recyclerView.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m70902a(SNSPreviewPhotoDocumentViewModel$Content$ButtonAction sNSPreviewPhotoDocumentViewModel$Content$ButtonAction) {
        int i11 = sNSPreviewPhotoDocumentViewModel$Content$ButtonAction == null ? -1 : AbstractC31787e.f64594a[sNSPreviewPhotoDocumentViewModel$Content$ButtonAction.ordinal()];
        if (i11 == 1) {
            C28367f.m69257a(getAnalyticsDelegate(), getF65153b(), getF66531c(), Control.AcceptButton, ((AbstractC31770c0) getViewModel$idensic_mobile_sdk_aar_defaultRelease()).m70868e(), 16);
            AbstractC31770c0 abstractC31770c0 = (AbstractC31770c0) getViewModel$idensic_mobile_sdk_aar_defaultRelease();
            abstractC31770c0.getClass();
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "onDataIsReadableClicked", null);
            C41696j.m91104d(ViewModelKt.getViewModelScope(abstractC31770c0), null, null, new C31743D(abstractC31770c0, null), 3, null);
            return;
        }
        if (i11 != 2) {
            return;
        }
        C28367f.m69257a(getAnalyticsDelegate(), getF65153b(), getF66531c(), Control.RetakeButton, ((AbstractC31770c0) getViewModel$idensic_mobile_sdk_aar_defaultRelease()).m70868e(), 16);
        AbstractC31770c0 abstractC31770c1 = (AbstractC31770c0) getViewModel$idensic_mobile_sdk_aar_defaultRelease();
        abstractC31770c1.getClass();
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "onTakeAnotherDataClicked", null);
        SNSEventHandler eventHandler = C28468k0.f57983a.getEventHandler();
        if (eventHandler != null) {
            eventHandler.onEvent(new SNSEvent.PhotoDeclined(abstractC31770c1.f64476a.getType().f59014a));
        }
        C32635M c32635m = abstractC31770c1.f64559h;
        C28936t c28936t = c32635m.f66624p;
        KProperty kProperty = C32635M.f66607x[2];
        C29015J c29015j = (C29015J) c28936t.m69705a();
        if (c29015j != null && c29015j.f58958b) {
            c32635m.m71244a(CollectionsKt.emptyList());
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(abstractC31770c1), null, null, new C31759U(abstractC31770c1, null), 3, null);
    }

    /* JADX INFO: renamed from: a */
    public static final void m70895a(AbstractC31826m abstractC31826m, C31932u c31932u, View view) {
        abstractC31826m.m70909k();
        if (c31932u.f64917d) {
            AbstractC31770c0 abstractC31770c0 = (AbstractC31770c0) abstractC31826m.getViewModel$idensic_mobile_sdk_aar_defaultRelease();
            abstractC31770c0.getClass();
            C41696j.m91104d(ViewModelKt.getViewModelScope(abstractC31770c0), null, null, new C31758T(abstractC31770c0, null), 3, null);
        } else {
            AbstractC31770c0 abstractC31770c1 = (AbstractC31770c0) abstractC31826m.getViewModel$idensic_mobile_sdk_aar_defaultRelease();
            abstractC31770c1.fireEvent(new C31509b(abstractC31770c1.f64476a));
            abstractC31770c1.f64559h.m71254g();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m70904a(final C31932u c31932u) {
        TextView textView;
        Button button;
        Button button2;
        View viewFindViewById;
        if (c31932u.f64917d && !Intrinsics.areEqual(this.f64685s, c31932u)) {
            this.f64685s = c31932u;
            C28367f.m69255a(getAnalyticsDelegate(), Block.FastFail, MapsKt.mapOf(TuplesKt.m90091to("errors", c31932u.f64918e)));
        }
        ViewGroup viewGroupM70908j = m70908j();
        if (viewGroupM70908j != null && (viewFindViewById = viewGroupM70908j.findViewById(R$id.sns_warning_icon)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ViewGroup viewGroupM70908j2 = m70908j();
        TextView textView2 = viewGroupM70908j2 != null ? (TextView) viewGroupM70908j2.findViewById(R$id.sns_warning_message) : null;
        if (textView2 != null) {
            AbstractC28458h.m69341a(textView2, c31932u.f64914a);
        }
        ViewGroup viewGroupM70908j3 = m70908j();
        if (viewGroupM70908j3 != null && (button2 = (Button) viewGroupM70908j3.findViewById(R$id.sns_warning_primary_button)) != null) {
            AbstractC28458h.m69341a(button2, c31932u.f64915b);
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.m0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC31826m.m70895a(this.f64686b, c31932u, view);
                }
            });
        }
        ViewGroup viewGroupM70908j4 = m70908j();
        if (viewGroupM70908j4 != null && (button = (Button) viewGroupM70908j4.findViewById(R$id.sns_warning_secondary_button)) != null) {
            AbstractC28458h.m69341a(button, c31932u.f64916c);
            button.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.n0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC31826m.m70899b(this.f64875b, c31932u, view);
                }
            });
        }
        ViewGroup viewGroupM70908j5 = m70908j();
        if (viewGroupM70908j5 != null && (textView = (TextView) viewGroupM70908j5.findViewById(R$id.sns_warning_title)) != null) {
            AbstractC28458h.m69341a(textView, (CharSequence) null);
        }
        ViewGroup viewGroupM70908j6 = m70908j();
        if (viewGroupM70908j6 != null) {
            OneShotPreDrawListener.add(viewGroupM70908j6, new RunnableC31824l(viewGroupM70908j6, textView2, this));
        }
    }

    /* JADX WARN: Code duplicated, block: B:149:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0211  */
    /* JADX INFO: renamed from: a */
    public final void m70903a(C31931t c31931t) {
        char c11;
        char c12;
        char c13;
        boolean z11;
        CharSequence charSequence;
        C31915o c31915o;
        boolean z12;
        C31913n c31913n;
        C31915o c31915o2;
        char c14 = '\n';
        if (c31931t.f64909a.isEmpty()) {
            c11 = '\n';
            c12 = 5;
            c13 = 2;
        } else {
            List list = c31931t.f64909a;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Bitmap bitmap = ((C30152w) it.next()).f60589a;
                if (bitmap != null) {
                    arrayList.add(bitmap);
                }
            }
            ViewPager2 viewPager2M70906h = m70906h();
            if (viewPager2M70906h != null) {
                viewPager2M70906h.setVisibility(!arrayList.isEmpty() ? 0 : 8);
            }
            if (arrayList.isEmpty()) {
                c11 = '\n';
                c12 = 5;
                c13 = 2;
            } else {
                ViewPager2 viewPager2M70906h2 = m70906h();
                if ((viewPager2M70906h2 != null ? viewPager2M70906h2.getHeight() : 0) > 0) {
                    m70901a(arrayList.size());
                } else {
                    ViewPager2 viewPager2M70906h3 = m70906h();
                    if (viewPager2M70906h3 != null) {
                        OneShotPreDrawListener.add(viewPager2M70906h3, new RunnableC31795i(viewPager2M70906h3, this, arrayList));
                    }
                }
                List list2 = c31931t.f64909a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list2) {
                    if (((C30152w) obj).f60589a != null) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    C30152w c30152w = (C30152w) obj2;
                    Bitmap bitmap2 = c30152w.f60589a;
                    if (bitmap2 != null) {
                        arrayList3.add(new C31767b(bitmap2, c30152w.f60590b, c30152w.f60591c));
                        c14 = c14;
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                c11 = c14;
                c12 = 5;
                c13 = 2;
                C31769c c31769c = this.f64668b;
                if (c31769c != null) {
                    c31769c.f64555a = arrayList3;
                    c31769c.notifyDataSetChanged();
                }
                ViewPager2 viewPager2M70906h4 = m70906h();
                if (viewPager2M70906h4 != null) {
                    viewPager2M70906h4.setCurrentItem(this.f64684r);
                }
            }
        }
        C31932u c31932u = c31931t.f64910b;
        if (c31932u != null) {
            if (getContext() != null) {
                InterfaceC41775x1 interfaceC41775x1 = this.f64683q;
                if (interfaceC41775x1 != null) {
                    InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
                }
                BottomSheetBehavior bottomSheetBehavior = this.f64682p;
                if (bottomSheetBehavior == null || bottomSheetBehavior.getState() != 3) {
                    this.f64683q = C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C31820j(this, c31932u, null), 3, null);
                } else {
                    m70904a(c31932u);
                }
                C28404L c28404l = this.f64675i;
                KProperty[] kPropertyArr = f64666t;
                TextView textView = (TextView) c28404l.getValue(this, kPropertyArr[7]);
                if (textView != null) {
                    AbstractC28458h.m69341a(textView, (CharSequence) null);
                }
                TextView textView2 = (TextView) this.f64673g.getValue(this, kPropertyArr[c12]);
                TextView textViewM70907i = m70907i();
                Button button = (Button) this.f64680n.getValue(this, kPropertyArr[12]);
                Button button2 = (Button) this.f64671e.getValue(this, kPropertyArr[3]);
                View[] viewArr = new View[4];
                viewArr[0] = textView2;
                viewArr[1] = textViewM70907i;
                viewArr[c13] = button;
                viewArr[3] = button2;
                for (int i12 = 0; i12 < 4; i12++) {
                    View view = viewArr[i12];
                    if (view != null) {
                        view.setVisibility(4);
                    }
                }
            }
        } else {
            m70909k();
            C28404L c28404l2 = this.f64673g;
            KProperty[] kPropertyArr2 = f64666t;
            TextView textView3 = (TextView) c28404l2.getValue(this, kPropertyArr2[c12]);
            TextView textViewM70907i2 = m70907i();
            Button button3 = (Button) this.f64680n.getValue(this, kPropertyArr2[12]);
            Button button4 = (Button) this.f64671e.getValue(this, kPropertyArr2[3]);
            View[] viewArr2 = new View[4];
            viewArr2[0] = textView3;
            viewArr2[1] = textViewM70907i2;
            viewArr2[c13] = button3;
            viewArr2[3] = button4;
            AbstractC28458h.m69352b(viewArr2);
        }
        Logger.DefaultImpls.v$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "showContent: show=" + c31931t.f64912d, null, 4, null);
        C28404L c28404l3 = this.f64679m;
        KProperty[] kPropertyArr3 = f64666t;
        Group group = (Group) c28404l3.getValue(this, kPropertyArr3[11]);
        if (group != null) {
            group.setVisibility(c31931t.f64912d ? 0 : 8);
        }
        C30152w c30152w2 = (C30152w) CollectionsKt.firstOrNull(c31931t.f64909a);
        if (!c31931t.f64909a.isEmpty()) {
            c30152w2 = (C30152w) CollectionsKt.getOrNull(c31931t.f64909a, this.f64684r);
        }
        if (!c31931t.f64911c) {
            z11 = false;
        } else if (c30152w2 != null && c30152w2.f60592d) {
            z11 = true;
        } else {
            z11 = false;
        }
        ImageButton imageButton = (ImageButton) this.f64677k.getValue(this, kPropertyArr3[9]);
        if (imageButton != null) {
            imageButton.setVisibility(!z11 ? 4 : 0);
        }
        ImageButton imageButton2 = (ImageButton) this.f64678l.getValue(this, kPropertyArr3[c11]);
        if (imageButton2 != null) {
            imageButton2.setVisibility(!z11 ? 4 : 0);
        }
        final C31916p c31916p = c31931t.f64913e;
        updatePoweredByVisibility(((AbstractC31770c0) getViewModel$idensic_mobile_sdk_aar_defaultRelease()).shouldHideLogo());
        TextView textView4 = (TextView) this.f64675i.getValue(this, kPropertyArr3[7]);
        if (textView4 != null) {
            textView4.setVisibility(8);
        }
        if (c31931t.f64912d) {
            if (c31916p == null || (c31915o2 = c31916p.f64884f) == null || (charSequence = c31915o2.f64877a) == null) {
                charSequence = c31916p != null ? c31916p.f64879a : null;
            }
            TextView textView5 = (TextView) this.f64673g.getValue(this, kPropertyArr3[c12]);
            if (textView5 != null) {
                AbstractC28458h.m69341a(textView5, charSequence);
            }
            TextView textViewM70907i3 = m70907i();
            if (textViewM70907i3 != null) {
                AbstractC28458h.m69341a(textViewM70907i3, c31916p != null ? c31916p.f64880b : null);
            }
            SNSImageView sNSImageView = (SNSImageView) this.f64672f.getValue(this, kPropertyArr3[4]);
            if (sNSImageView != null) {
                sNSImageView.setVisibility(8);
            }
            TextView textViewM70907i4 = m70907i();
            if (textViewM70907i4 != null) {
                textViewM70907i4.setGravity(17);
            }
            Button button5 = (Button) this.f64680n.getValue(this, kPropertyArr3[12]);
            if (button5 != null) {
                button5.setText((c31916p == null || (c31913n = c31916p.f64881c) == null) ? null : c31913n.f64874b);
                button5.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.e0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        AbstractC31826m.m70894a(this.f64595b, c31916p, view2);
                    }
                });
                if (c31931t.f64910b != null) {
                    z12 = false;
                } else if ((c31916p != null ? c31916p.f64881c : null) != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                button5.setVisibility(z12 ? 0 : 8);
            }
            Button button6 = (Button) this.f64671e.getValue(this, kPropertyArr3[3]);
            if (button6 != null) {
                button6.setText(c31916p != null ? c31916p.f64882d.f64874b : null);
                button6.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.f0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        AbstractC31826m.m70898b(this.f64598b, c31916p, view2);
                    }
                });
                button6.setVisibility((c31916p != null ? c31916p.f64882d : null) != null ? 0 : 8);
            }
            if ((c31916p != null ? c31916p.f64884f : null) != null) {
                TextView textViewM70907i5 = m70907i();
                if (textViewM70907i5 != null) {
                    textViewM70907i5.setVisibility(4);
                }
                SNSImageView sNSImageView2 = (SNSImageView) this.f64672f.getValue(this, kPropertyArr3[4]);
                if (sNSImageView2 != null) {
                    sNSImageView2.setVisibility(8);
                }
            }
            Button button7 = (Button) this.f64680n.getValue(this, kPropertyArr3[12]);
            if (button7 != null) {
                button7.setEnabled((c31916p != null ? c31916p.f64884f : null) == null);
            }
            Button button8 = (Button) this.f64671e.getValue(this, kPropertyArr3[3]);
            if (button8 != null) {
                button8.setEnabled((c31916p != null ? c31916p.f64884f : null) == null);
            }
            boolean z13 = (c31916p != null ? c31916p.f64884f : null) != null;
            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) this.f64670d.getValue(this, kPropertyArr3[c13]);
            if (linearProgressIndicator != null) {
                linearProgressIndicator.setVisibility(z13 ? 0 : 8);
                linearProgressIndicator.setProgress((c31916p == null || (c31915o = c31916p.f64884f) == null) ? 0 : c31915o.f64878b);
                ImageButton imageButton3 = (ImageButton) this.f64677k.getValue(this, kPropertyArr3[9]);
                if (imageButton3 != null) {
                    imageButton3.setVisibility(z13 ? 4 : 0);
                }
                ImageButton imageButton4 = (ImageButton) this.f64678l.getValue(this, kPropertyArr3[c11]);
                if (imageButton4 != null) {
                    imageButton4.setVisibility(z13 ? 4 : 0);
                    return;
                }
                return;
            }
            return;
        }
        TextView textView6 = (TextView) this.f64673g.getValue(this, kPropertyArr3[c12]);
        TextView textViewM70907i6 = m70907i();
        Button button9 = (Button) this.f64680n.getValue(this, kPropertyArr3[12]);
        Button button10 = (Button) this.f64671e.getValue(this, kPropertyArr3[3]);
        SNSImageView sNSImageView3 = (SNSImageView) this.f64672f.getValue(this, kPropertyArr3[4]);
        ViewPager2 viewPager2M70906h5 = m70906h();
        LinearProgressIndicator linearProgressIndicator2 = (LinearProgressIndicator) this.f64670d.getValue(this, kPropertyArr3[c13]);
        View[] viewArr3 = new View[7];
        viewArr3[0] = textView6;
        viewArr3[1] = textViewM70907i6;
        viewArr3[c13] = button9;
        viewArr3[3] = button10;
        viewArr3[4] = sNSImageView3;
        viewArr3[c12] = viewPager2M70906h5;
        viewArr3[6] = linearProgressIndicator2;
        AbstractC28458h.m69344a(viewArr3);
        SNSRotationZoomableImageView sNSRotationZoomableImageView = (SNSRotationZoomableImageView) this.f64669c.getValue(this, kPropertyArr3[1]);
        if (sNSRotationZoomableImageView != null) {
            sNSRotationZoomableImageView.clearImage();
        }
        C31769c c31769c2 = this.f64668b;
        if (c31769c2 != null) {
            c31769c2.f64555a = CollectionsKt.emptyList();
            c31769c2.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m70894a(AbstractC31826m abstractC31826m, C31916p c31916p, View view) {
        C31913n c31913n;
        abstractC31826m.m70902a((c31916p == null || (c31913n = c31916p.f64881c) == null) ? null : c31913n.f64873a);
    }
}
