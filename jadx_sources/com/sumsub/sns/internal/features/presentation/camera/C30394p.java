package com.sumsub.sns.internal.features.presentation.camera;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.core.data.listener.SNSInstructionsViewHandler;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.presentation.intro.C28236b;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.common.AbstractC28485q;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.common.AbstractC28787t;
import com.sumsub.sns.internal.core.presentation.common.C28778k;
import com.sumsub.sns.internal.core.presentation.helper.camera.AbstractC28885f;
import com.sumsub.sns.internal.core.presentation.helper.camera.C28882c;
import com.sumsub.sns.internal.core.presentation.helper.camera.C28883d;
import com.sumsub.sns.internal.core.presentation.intro.C28895g;
import java.util.Map;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30394p extends AbstractC28787t {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ KProperty[] f61148k = {AbstractC28118g.m69077a(C30394p.class, "helperView", "getHelperView()Landroid/view/View;", 0), AbstractC28118g.m69077a(C30394p.class, "darkOverlay", "getDarkOverlay()Landroid/view/View;", 0)};

    /* JADX INFO: renamed from: e */
    public final C30390n f61149e;

    /* JADX INFO: renamed from: f */
    public final String f61150f;

    /* JADX INFO: renamed from: g */
    public final Lazy f61151g;

    /* JADX INFO: renamed from: h */
    public final C28778k f61152h;

    /* JADX INFO: renamed from: i */
    public final C28778k f61153i;

    /* JADX INFO: renamed from: j */
    public BottomSheetBehavior f61154j;

    public C30394p(AbstractC28133l abstractC28133l, final Function0 function0, C30390n c30390n) {
        super(abstractC28133l, null);
        this.f61149e = c30390n;
        this.f61150f = "CameraHelper";
        this.f61151g = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.v0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30394p.m70264a(function0);
            }
        });
        this.f61152h = m69602a(c30390n.f61138a);
        this.f61153i = m69602a(c30390n.f61139b);
    }

    /* JADX INFO: renamed from: a */
    public static final C30388m m70264a(Function0 function0) {
        return (C30388m) function0.invoke();
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: m */
    public final void mo69522m() {
        this.f61154j = null;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70265a(C30394p c30394p, AbstractC28885f abstractC28885f) {
        c30394p.getClass();
        if (abstractC28885f instanceof C28883d) {
            C28883d c28883d = (C28883d) abstractC28885f;
            C28895g c28895g = c28883d.f58729a;
            Map map = c28883d.f58730b;
            View view = c30394p.f58549a.getView();
            if (view != null) {
                View viewFindViewById = view.findViewById(c30394p.f61149e.f61140c);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(8);
                }
                if (!c30394p.m70269a(c28895g)) {
                    ViewGroup viewGroup = (ViewGroup) view.findViewById(c30394p.f61149e.f61141d);
                    if (viewGroup != null) {
                        viewGroup.removeAllViews();
                    }
                    C28236b.m69184a(new C28236b(c30394p.f58549a.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease().f58179q, c30394p.f58549a.getAppListener$idensic_mobile_sdk_aar_defaultRelease()), view, map, c30394p.f61149e.f61141d, -1);
                }
            }
        } else if (abstractC28885f instanceof C28882c) {
            C28882c c28882c = (C28882c) abstractC28885f;
            c30394p.m70268a(c28882c.f58725a, c28882c.f58727c, c28882c.f58728d);
        }
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: h */
    public final String mo69480h() {
        return this.f61150f;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: l */
    public final void mo69495l() {
        m69605a((C30388m) this.f61151g.getValue(), new Function1() { // from class: com.sumsub.sns.internal.features.presentation.camera.w0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C30394p.m70265a(this.f62221b, (AbstractC28885f) obj);
            }
        });
        m70270n();
    }

    /* JADX INFO: renamed from: n */
    public final void m70270n() {
        BottomSheetBehavior bottomSheetBehaviorFrom;
        C28778k c28778k = this.f61152h;
        KProperty[] kPropertyArr = f61148k;
        View view = (View) c28778k.getValue(this, kPropertyArr[0]);
        if (view != null) {
            bottomSheetBehaviorFrom = BottomSheetBehavior.from(view);
            bottomSheetBehaviorFrom.setHideable(false);
            bottomSheetBehaviorFrom.setPeekHeight(0);
        } else {
            bottomSheetBehaviorFrom = null;
        }
        this.f61154j = bottomSheetBehaviorFrom;
        View view2 = (View) this.f61153i.getValue(this, kPropertyArr[1]);
        if (view2 != null) {
            view2.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.camera.y0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    C30394p.m70267a(this.f62224b, view3);
                }
            });
            view2.setAlpha(0.0f);
        }
        BottomSheetBehavior bottomSheetBehavior = this.f61154j;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.addBottomSheetCallback(new C30392o(this));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m70268a(String str, String str2, C28895g c28895g) {
        View view = this.f58549a.getView();
        if (view == null || ((View) this.f61152h.getValue(this, f61148k[0])) == null || m70269a(c28895g)) {
            return;
        }
        View viewFindViewById = view.findViewById(this.f61149e.f61140c);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(0);
        }
        View viewFindViewById2 = view.findViewById(this.f61149e.f61141d);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        TextView textView = (TextView) view.findViewById(this.f61149e.f61142e);
        if (textView != null) {
            textView.setText(str);
        }
        View viewFindViewById3 = view.findViewById(this.f61149e.f61143f);
        if (viewFindViewById3 != null) {
            viewFindViewById3.setVisibility(8);
        }
        TextView textView2 = (TextView) view.findViewById(this.f61149e.f61144g);
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        if (textView2 != null) {
            textView2.setText(AbstractC28462i0.m69364a(str2, this.f58549a.requireContext()));
        }
        if (textView2 != null) {
            AbstractC28485q.m69381a(textView2, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.camera.x0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C30394p.m70266a(this.f62223b, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70266a(C30394p c30394p, String str) {
        AbstractC28052C.onLinkClicked$default(c30394p.f58549a.getViewModel$idensic_mobile_sdk_aar_defaultRelease(), str, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final void m70267a(C30394p c30394p, View view) {
        BottomSheetBehavior bottomSheetBehavior = c30394p.f61154j;
        if (bottomSheetBehavior == null || bottomSheetBehavior.getState() != 3) {
            return;
        }
        bottomSheetBehavior.setState(4);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m70269a(C28895g c28895g) {
        SNSInstructionsViewHandler instructionsViewHandler = C28468k0.f57983a.getInstructionsViewHandler();
        View viewOnVerificationStep = instructionsViewHandler != null ? instructionsViewHandler.onVerificationStep(this.f58549a.requireContext(), c28895g.f58752a, c28895g.f58754c, c28895g.f58753b, SNSInstructionsViewHandler.Position.BOTTOMSHEET.getValue(), c28895g.f58755d) : null;
        if (viewOnVerificationStep == null) {
            return false;
        }
        View viewRequireView = this.f58549a.requireView();
        View viewFindViewById = viewRequireView.findViewById(this.f61149e.f61140c);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        ViewGroup viewGroup = (ViewGroup) viewRequireView.findViewById(this.f61149e.f61141d);
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        if (viewGroup == null) {
            return true;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        int dimensionPixelSize = this.f58549a.requireContext().getResources().getDimensionPixelSize(R$dimen.sns_margin_medium);
        marginLayoutParams.setMarginStart(dimensionPixelSize);
        marginLayoutParams.setMarginEnd(dimensionPixelSize);
        marginLayoutParams.bottomMargin = dimensionPixelSize;
        Unit unit = Unit.INSTANCE;
        viewGroup.addView(viewOnVerificationStep, marginLayoutParams);
        return true;
    }
}
