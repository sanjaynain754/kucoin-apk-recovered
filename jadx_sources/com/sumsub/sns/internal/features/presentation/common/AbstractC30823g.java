package com.sumsub.sns.internal.features.presentation.common;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentResultListener;
import androidx.viewbinding.ViewBinding;
import com.sumsub.sns.R$string;
import com.sumsub.sns.core.presentation.base.AbstractC28058F;
import com.sumsub.sns.core.presentation.base.AbstractC28081V;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.core.widget.SNSCommonBottomSheetView;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Popup;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.core.common.AbstractC28441c;
import com.sumsub.sns.internal.core.common.AbstractC28495t0;
import com.sumsub.sns.internal.core.common.InterfaceC28498u0;
import com.sumsub.sns.internal.core.presentation.android.C28710y;
import com.sumsub.sns.internal.core.presentation.common.C28761a;
import com.sumsub.sns.internal.features.data.model.common.C29015J;
import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.domain.documents.AbstractC30117K;
import com.sumsub.sns.internal.features.domain.documents.C30110D;
import com.sumsub.sns.internal.features.domain.documents.C30119M;
import com.sumsub.sns.internal.features.domain.documents.C30120N;
import com.sumsub.sns.internal.features.domain.documents.C30152w;
import com.sumsub.sns.internal.features.domain.documents.C30154y;
import com.sumsub.sns.internal.features.presentation.camera.photo.document.C30468J;
import com.sumsub.sns.internal.features.presentation.camera.photo.document.C30654y;
import com.sumsub.sns.internal.features.presentation.camera.photo.document.DocCapture$PreferredMode;
import com.sumsub.sns.internal.features.presentation.common.AbstractC30808G;
import com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2;
import com.sumsub.sns.internal.features.presentation.main.SNSAppActivity;
import com.sumsub.sns.internal.features.presentation.preview.simplepreview.C31972f;
import com.sumsub.sns.internal.features.presentation.utils.C32664o;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import java.io.File;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.common.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/common/g;", "Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lcom/sumsub/sns/core/presentation/base/V;", ExifInterface.LATITUDE_SOUTH, "Lcom/sumsub/sns/internal/features/presentation/common/G;", "VM", "Lcom/sumsub/sns/core/presentation/base/F;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSImageDocumentsAwareFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSImageDocumentsAwareFragment.kt\ncom/sumsub/sns/internal/features/presentation/common/SNSImageDocumentsAwareFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,258:1\n1#2:259\n*E\n"})
public abstract class AbstractC30823g<V extends ViewBinding, S extends AbstractC28081V, VM extends AbstractC30808G> extends AbstractC28058F<V, S, VM> {

    /* JADX INFO: renamed from: U */
    public static final /* synthetic */ int f62258U = 0;

    /* JADX INFO: renamed from: a */
    public C28710y f62259a;

    /* JADX INFO: renamed from: b */
    public final C28761a f62260b = new C28761a(this, new C30817d(this), new C30819e(this));

    /* JADX INFO: renamed from: c */
    public final C32664o f62261c = new C32664o(new Function1() { // from class: com.sumsub.sns.internal.features.presentation.common.f0
        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return AbstractC30823g.m70483a(this.f62257b, ((Integer) obj).intValue());
        }
    }, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.common.g0
        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return AbstractC30823g.m70487b(this.f62262b, ((Integer) obj).intValue());
        }
    }, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.common.h0
        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return AbstractC30823g.m70484a(this.f62265b, (C30152w) obj);
        }
    });

    /* JADX INFO: renamed from: b */
    public static final Unit m70487b(AbstractC30823g abstractC30823g, int i11) {
        C28367f.m69256a(abstractC30823g.getAnalyticsDelegate(), Control.DeleteButton, MapsKt.mapOf(TuplesKt.m90091to("index", Integer.valueOf(i11))), (Popup) null, 4);
        abstractC30823g.mo70491a(i11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public void mo70491a(int i11) {
    }

    /* JADX INFO: renamed from: f */
    public abstract SNSCommonBottomSheetView mo70492f();

    /* JADX INFO: renamed from: a */
    public static final Unit m70483a(AbstractC30823g abstractC30823g, int i11) {
        C28367f.m69256a(abstractC30823g.getAnalyticsDelegate(), Control.DocumentField, MapsKt.mapOf(TuplesKt.m90091to("hasDocument", Boolean.FALSE)), (Popup) null, 4);
        ((AbstractC30808G) abstractC30823g.getViewModel$idensic_mobile_sdk_aar_defaultRelease()).intent(new C30843t(i11));
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public void handleEvent(InterfaceC28145r interfaceC28145r) {
        View viewFindViewById;
        if (interfaceC28145r instanceof C30833l) {
            C30833l c30833l = (C30833l) interfaceC28145r;
            View view = getView();
            if (view != null && (viewFindViewById = view.findViewById(c30833l.f62274a)) != null) {
                this.f62260b.m69584a(viewFindViewById);
            }
        } else {
            if (!(interfaceC28145r instanceof C30120N)) {
                if (interfaceC28145r instanceof C30154y) {
                    C30654y c30654y = C30468J.f61431o;
                    C30154y c30154y = (C30154y) interfaceC28145r;
                    C30119M c30119m = c30154y.f60596a;
                    boolean z11 = c30119m.f60550a;
                    C29070X type = c30119m.f60551b.getType();
                    C30119M c30119m2 = c30154y.f60596a;
                    List list = c30119m2.f60552c;
                    boolean z12 = c30119m2.f60553d;
                    String str = c30119m2.f60554e;
                    DocCapture$PreferredMode docCapture$PreferredMode = c30119m2.f60556g;
                    boolean z13 = c30119m2.f60555f;
                    String str2 = c30119m2.f60557h;
                    c30654y.getClass();
                    AbstractC28133l.navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(this, C30654y.m70416a(z11, type, list, z12, str, docCapture$PreferredMode, z13, str2, null, false).forResult("request_photo_picker"), "SNSPhotoDocumentPickerFragment2", false, 4, null);
                    return;
                }
                if (interfaceC28145r instanceof C30842s) {
                    C30110D c30110d = ((C30842s) interfaceC28145r).f62288a;
                    String f65006c = getF65006c();
                    C31972f c31972f = new C31972f();
                    c31972f.setArguments(BundleKt.bundleOf(TuplesKt.m90091to("image_data", c30110d), TuplesKt.m90091to("doc_set_type", f65006c)));
                    AbstractC28133l.navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(this, c31972f.forResult("request_photo_viewer"), "SNSSimpleDocumentViewerFragment", false, 4, null);
                    return;
                }
                if (!(interfaceC28145r instanceof C30840q)) {
                    super.handleEvent(interfaceC28145r);
                    return;
                }
                C28710y c28710y = this.f62259a;
                if (c28710y == null || c28710y.m69536a(String.valueOf(System.currentTimeMillis()))) {
                    return;
                }
                ((AbstractC30808G) getViewModel$idensic_mobile_sdk_aar_defaultRelease()).getClass();
                return;
            }
            InterfaceC28498u0 appListener$idensic_mobile_sdk_aar_defaultRelease = getAppListener$idensic_mobile_sdk_aar_defaultRelease();
            if (appListener$idensic_mobile_sdk_aar_defaultRelease != null) {
                C30120N c30120n = (C30120N) interfaceC28145r;
                ((AbstractC31275i2) ((SNSAppActivity) appListener$idensic_mobile_sdk_aar_defaultRelease).f63147e.getValue()).mo70624a(c30120n.f60559a, c30120n.f60560b, m70493g());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m70489c(AbstractC30823g abstractC30823g, String str, Bundle bundle) {
        AbstractC30117K abstractC30117K = (AbstractC30117K) bundle.getParcelable("result_data");
        if (abstractC30117K != null) {
            ((AbstractC30808G) abstractC30823g.getViewModel$idensic_mobile_sdk_aar_defaultRelease()).intent(new C30839p(abstractC30117K));
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m70490d(AbstractC30823g abstractC30823g, String str, Bundle bundle) {
        int i11 = bundle.getInt("rotation", 0);
        File file = (File) bundle.getSerializable("file");
        if (file == null) {
            return;
        }
        ((AbstractC30808G) abstractC30823g.getViewModel$idensic_mobile_sdk_aar_defaultRelease()).intent(new C30831k(i11, file));
    }

    /* JADX INFO: renamed from: g */
    public final String m70493g() {
        return "instructions_request_key_" + getF65006c() + "_" + Reflection.getOrCreateKotlinClass(getClass()).getQualifiedName();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        C28710y c28710y = new C28710y(requireActivity().getActivityResultRegistry(), AbstractC33294e.m71624a(this), AbstractC28441c.m69321a(getResources().getString(R$string.sns_gallery_type)), new Function2() { // from class: com.sumsub.sns.internal.features.presentation.common.i0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AbstractC30823g.m70485a(this.f62269b, (String) obj, (Uri) obj2);
            }
        }, "TYPE_UNKNOWN");
        if (bundle != null && (string = bundle.getString("last_picker_request_id")) != null) {
            c28710y.f58390h = string;
        }
        getLifecycle().addObserver(c28710y);
        this.f62259a = c28710y;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        String str;
        super.onSaveInstanceState(bundle);
        C28710y c28710y = this.f62259a;
        if (c28710y != null && (str = c28710y.f58390h) != null) {
            bundle.putString("last_picker_request_id", str);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        requireActivity().getSupportFragmentManager().setFragmentResultListener("request_photo_picker", this, new FragmentResultListener() { // from class: com.sumsub.sns.internal.features.presentation.common.j0
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle2) {
                AbstractC30823g.m70488b(this.f62270a, str, bundle2);
            }
        });
        requireActivity().getSupportFragmentManager().setFragmentResultListener("request_photo_viewer", this, new FragmentResultListener() { // from class: com.sumsub.sns.internal.features.presentation.common.k0
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle2) {
                AbstractC30823g.m70489c(this.f62273a, str, bundle2);
            }
        });
        requireActivity().getSupportFragmentManager().setFragmentResultListener("request_image_rotation", this, new FragmentResultListener() { // from class: com.sumsub.sns.internal.features.presentation.common.l0
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle2) {
                AbstractC30823g.m70490d(this.f62275a, str, bundle2);
            }
        });
        requireActivity().getSupportFragmentManager().setFragmentResultListener(m70493g(), this, new FragmentResultListener() { // from class: com.sumsub.sns.internal.features.presentation.common.m0
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle2) {
                AbstractC30823g.m70486a(this.f62279a, str, bundle2);
            }
        });
        AbstractC28421U.m69305b(((AbstractC30808G) getViewModel$idensic_mobile_sdk_aar_defaultRelease()).f62239d, getViewLifecycleOwner(), new C30821f(this, null));
    }

    /* JADX INFO: renamed from: b */
    public static final void m70488b(AbstractC30823g abstractC30823g, String str, Bundle bundle) {
        C29054T c29054t = (C29054T) bundle.getParcelable("DOCUMENT_RESULT");
        C29015J c29015j = (C29015J) bundle.getParcelable("DOCUMENT_RESULTS");
        AbstractC28133l.Companion.getClass();
        ((AbstractC30808G) abstractC30823g.getViewModel$idensic_mobile_sdk_aar_defaultRelease()).intent(new C30837n(c29054t, c29015j, bundle.getInt(AbstractC28133l.FRAGMENT_RESULT_KEY)));
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70484a(AbstractC30823g abstractC30823g, C30152w c30152w) {
        InterfaceC28498u0 appListener$idensic_mobile_sdk_aar_defaultRelease;
        C28367f.m69256a(abstractC30823g.getAnalyticsDelegate(), Control.DocumentField, MapsKt.mapOf(TuplesKt.m90091to("hasDocument", Boolean.TRUE)), (Popup) null, 4);
        File file = c30152w.f60590b;
        if (file != null && (appListener$idensic_mobile_sdk_aar_defaultRelease = abstractC30823g.getAppListener$idensic_mobile_sdk_aar_defaultRelease()) != null) {
            AbstractC28495t0.m69386a(appListener$idensic_mobile_sdk_aar_defaultRelease, file, c30152w.f60591c, abstractC30823g.getF65006c(), null, null, 48);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70485a(AbstractC30823g abstractC30823g, String str, Uri uri) {
        abstractC30823g.getClass();
        if (uri != null) {
            try {
                ((AbstractC30808G) abstractC30823g.getViewModel$idensic_mobile_sdk_aar_defaultRelease()).intent(new C30835m(abstractC30823g.requireContext().getApplicationContext(), abstractC30823g.getResources().getString(R$string.sns_gallery_type), uri));
            } catch (Exception e11) {
                C33272c c33272c = C33272c.f67812a;
                String strM71624a = AbstractC33294e.m71624a(abstractC30823g);
                String message = e11.getMessage();
                if (message == null) {
                    message = "";
                }
                C33272c.f67814c.mo68956e(strM71624a, message, e11);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final void m70486a(AbstractC30823g abstractC30823g, String str, Bundle bundle) {
        Parcelable parcelable = bundle.getParcelable("payload");
        AbstractC30808G abstractC30808G = (AbstractC30808G) abstractC30823g.getViewModel$idensic_mobile_sdk_aar_defaultRelease();
        AbstractC28133l.Companion.getClass();
        abstractC30808G.intent(new C30838o(bundle.getInt(AbstractC28133l.FRAGMENT_RESULT_KEY) == -1, parcelable));
    }
}
