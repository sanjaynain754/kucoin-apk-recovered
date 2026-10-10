package com.sumsub.sns.internal.features.presentation.dialogs.bottomsheet;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.C7090R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.sumsub.sns.R$drawable;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.widget.SNSBottomSheetView;
import com.sumsub.sns.core.widget.SNSTextView;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.databinding.C28352q;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28394G;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.common.AbstractC28485q;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.common.InterfaceC28498u0;
import com.sumsub.sns.internal.core.presentation.theme.AbstractC28962j;
import com.sumsub.sns.internal.core.presentation.theme.C28956d;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import com.sumsub.sns.internal.features.presentation.main.SNSAppActivity;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.dialogs.bottomsheet.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSTermsAndConditionsDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSTermsAndConditionsDialog.kt\ncom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/SNSTermsAndConditionsDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,131:1\n1#2:132\n256#3,2:133\n256#3,2:135\n157#3,8:137\n*S KotlinDebug\n*F\n+ 1 SNSTermsAndConditionsDialog.kt\ncom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/SNSTermsAndConditionsDialog\n*L\n79#1:133,2\n82#1:135,2\n90#1:137,8\n*E\n"})
public final class C30915a extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: a */
    public C28352q f62455a;

    /* JADX INFO: renamed from: b */
    public final Lazy f62456b = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.dialogs.bottomsheet.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C30915a.m70517b(this.f62458b);
        }
    });

    /* JADX INFO: renamed from: c */
    public final Lazy f62457c = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.dialogs.bottomsheet.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C30915a.m70513a(this.f62459b);
        }
    });

    /* JADX INFO: renamed from: a */
    public static final Unit m70514a(C30915a c30915a, String str) {
        KeyEventDispatcher.Component activity = c30915a.getActivity();
        InterfaceC28498u0 interfaceC28498u0 = activity instanceof InterfaceC28498u0 ? (InterfaceC28498u0) activity : null;
        if (interfaceC28498u0 != null) {
            ((SNSAppActivity) interfaceC28498u0).m70610a(str, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static final String m70517b(C30915a c30915a) {
        Fragment fragmentPrevious;
        List<Fragment> fragments = c30915a.getParentFragmentManager().getFragments();
        ListIterator<Fragment> listIterator = fragments.listIterator(fragments.size());
        do {
            if (!listIterator.hasPrevious()) {
                fragmentPrevious = null;
                break;
            }
            fragmentPrevious = listIterator.previous();
        } while (!(fragmentPrevious instanceof AbstractC28133l));
        AbstractC28133l abstractC28133l = fragmentPrevious instanceof AbstractC28133l ? (AbstractC28133l) fragmentPrevious : null;
        String f66531c = abstractC28133l != null ? abstractC28133l.getF63761f() : null;
        return f66531c == null ? "TYPE_UNKNOWN" : f66531c;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R$layout.sns_fragment_terms_and_conditions, viewGroup, false);
        int i11 = R$id.sns_content;
        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(viewInflate, i11);
        if (nestedScrollView != null) {
            i11 = R$id.sns_text;
            SNSTextView sNSTextView = (SNSTextView) ViewBindings.findChildViewById(viewInflate, i11);
            if (sNSTextView != null) {
                i11 = R$id.sns_toolbar;
                SNSToolbarView sNSToolbarView = (SNSToolbarView) ViewBindings.findChildViewById(viewInflate, i11);
                if (sNSToolbarView != null) {
                    i11 = R$id.sns_web_content;
                    NestedScrollView nestedScrollView2 = (NestedScrollView) ViewBindings.findChildViewById(viewInflate, i11);
                    if (nestedScrollView2 != null) {
                        i11 = R$id.sns_webview;
                        WebView webView = (WebView) ViewBindings.findChildViewById(viewInflate, i11);
                        if (webView != null) {
                            SNSBottomSheetView sNSBottomSheetView = (SNSBottomSheetView) viewInflate;
                            this.f62455a = new C28352q(sNSBottomSheetView, nestedScrollView, sNSTextView, sNSToolbarView, nestedScrollView2, webView);
                            return sNSBottomSheetView;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.sumsub.sns.internal.features.presentation.dialogs.bottomsheet.d
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                C30915a.m70515a(this.f62460a, dialogInterface);
            }
        });
        dialogOnCreateDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.sumsub.sns.internal.features.presentation.dialogs.bottomsheet.e
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C30915a.m70518b(this.f62461b, dialogInterface);
            }
        });
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f62455a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SNSCustomizationTheme theme;
        C28966p c28966p;
        AbstractC28962j abstractC28962j;
        C28956d c28956d;
        String string;
        super.onViewCreated(view, bundle);
        C28352q c28352q = this.f62455a;
        if (c28352q != null) {
            m70519a(c28352q.f57783d);
        }
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("ARGS_DATA")) != null) {
            if (AbstractC28394G.f57881a.matcher(string).find()) {
                C28352q c28352q2 = this.f62455a;
                if (c28352q2 != null) {
                    c28352q2.f57781b.setVisibility(8);
                }
                C28352q c28352q3 = this.f62455a;
                if (c28352q3 != null) {
                    c28352q3.f57785f.loadDataWithBaseURL(null, string, "text/html", "UTF-8", null);
                }
            } else {
                C28352q c28352q4 = this.f62455a;
                if (c28352q4 != null) {
                    c28352q4.f57784e.setVisibility(8);
                }
                C28352q c28352q5 = this.f62455a;
                if (c28352q5 != null) {
                    c28352q5.f57782c.setText(AbstractC28462i0.m69364a(string, requireContext()));
                }
                C28352q c28352q6 = this.f62455a;
                if (c28352q6 != null) {
                    AbstractC28485q.m69381a(c28352q6.f57782c, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.dialogs.bottomsheet.f
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C30915a.m70514a(this.f62462b, (String) obj);
                        }
                    });
                }
            }
        }
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        Float f11 = null;
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
            SNSMetricElement sNSMetricElement = SNSMetricElement.SCREEN_HORIZONTAL_MARGIN;
            Map map = c28966p.f58878d;
            if (map != null) {
                abstractC28962j = (AbstractC28962j) map.get(sNSMetricElement.getValue());
            } else {
                abstractC28962j = null;
            }
            if (abstractC28962j instanceof C28956d) {
                c28956d = (C28956d) abstractC28962j;
            } else {
                c28956d = null;
            }
            if (c28956d != null) {
                f11 = c28956d.f58860a;
            }
            if (f11 != null) {
                float fFloatValue = f11.floatValue();
                C28352q c28352q7 = this.f62455a;
                if (c28352q7 != null) {
                    NestedScrollView nestedScrollView = c28352q7.f57784e;
                    int i11 = (int) fFloatValue;
                    nestedScrollView.setPadding(i11, nestedScrollView.getPaddingTop(), i11, nestedScrollView.getPaddingBottom());
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m70516a(C30915a c30915a, View view) {
        C28367f.m69257a((C28367f) c30915a.f62457c.getValue(), Screen.AgreementScreen, (String) c30915a.f62456b.getValue(), Control.CloseButton, null, 24);
        c30915a.dismiss();
    }

    /* JADX INFO: renamed from: b */
    public static final void m70518b(C30915a c30915a, DialogInterface dialogInterface) {
        C28367f.m69258a((C28367f) c30915a.f62457c.getValue(), Screen.AgreementScreen, (String) c30915a.f62456b.getValue(), (LinkedHashMap) null, 12);
    }

    /* JADX INFO: renamed from: a */
    public static final C28367f m70513a(C30915a c30915a) {
        return new C28367f(Screen.AgreementScreen, (String) c30915a.f62456b.getValue());
    }

    /* JADX INFO: renamed from: a */
    public static final void m70515a(C30915a c30915a, DialogInterface dialogInterface) {
        FrameLayout frameLayout = (FrameLayout) ((BottomSheetDialog) dialogInterface).findViewById(C7090R.id.design_bottom_sheet);
        if (frameLayout == null) {
            return;
        }
        BottomSheetBehavior.from(frameLayout).setState(3);
        C28367f.m69259a((C28367f) c30915a.f62457c.getValue(), Screen.AgreementScreen, (String) c30915a.f62456b.getValue(), (Map) null, 12);
    }

    /* JADX INFO: renamed from: a */
    public final void m70519a(SNSToolbarView sNSToolbarView) {
        Context contextRequireContext = requireContext();
        Drawable drawableOnResolveIcon = C28468k0.f57983a.getIconHandler().onResolveIcon(contextRequireContext, SNSIconHandler.SNSCommonIcons.CLOSE.getImageName());
        if (drawableOnResolveIcon == null) {
            drawableOnResolveIcon = ResourcesCompat.getDrawable(contextRequireContext.getResources(), R$drawable.sns_ic_close, contextRequireContext.getTheme());
        }
        sNSToolbarView.setCloseButtonDrawable(drawableOnResolveIcon);
        sNSToolbarView.setOnCloseButtonClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.dialogs.bottomsheet.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C30915a.m70516a(this.f62463b, view);
            }
        });
    }
}
