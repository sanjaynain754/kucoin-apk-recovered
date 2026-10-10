package com.sumsub.sns.internal.features.presentation.sumsubid.p124ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.webkit.CookieManager;
import android.webkit.PermissionRequest;
import android.webkit.WebView;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sumsub.sns.R$color;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.base.adapter.decorator.C28094b;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.widget.SNSPrimaryButton;
import com.sumsub.sns.core.widget.SNSSecondaryButton;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;
import com.sumsub.sns.core.widget.SNSTextView;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.databinding.C28331K;
import com.sumsub.sns.databinding.C28332L;
import com.sumsub.sns.databinding.C28333M;
import com.sumsub.sns.databinding.C28334N;
import com.sumsub.sns.databinding.C28335O;
import com.sumsub.sns.databinding.C28351p;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Popup;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.common.AbstractC28467k;
import com.sumsub.sns.internal.core.common.AbstractC28485q;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.util.C28972f;
import com.sumsub.sns.internal.features.presentation.sumsubid.AbstractC32498U0;
import com.sumsub.sns.internal.features.presentation.sumsubid.AbstractC32550p;
import com.sumsub.sns.internal.features.presentation.sumsubid.C32489P0;
import com.sumsub.sns.internal.features.presentation.sumsubid.C32491Q0;
import com.sumsub.sns.internal.features.presentation.sumsubid.C32492R0;
import com.sumsub.sns.internal.features.presentation.sumsubid.C32494S0;
import com.sumsub.sns.internal.features.presentation.sumsubid.C32496T0;
import com.sumsub.sns.internal.features.presentation.sumsubid.C32520f;
import com.sumsub.sns.internal.features.presentation.sumsubid.C32541m;
import com.sumsub.sns.internal.features.presentation.sumsubid.C32559t;
import com.sumsub.sns.internal.features.presentation.sumsubid.p124ui.adapter.C32568d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.ui.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32583i {

    /* JADX INFO: renamed from: a */
    public final C28351p f66451a;

    /* JADX INFO: renamed from: b */
    public final Function0 f66452b;

    /* JADX INFO: renamed from: c */
    public final C32559t f66453c;

    /* JADX INFO: renamed from: d */
    public final Function0 f66454d;

    /* JADX INFO: renamed from: e */
    public final Function0 f66455e;

    /* JADX INFO: renamed from: f */
    public WeakReference f66456f;

    /* JADX INFO: renamed from: g */
    public final C28972f f66457g;

    /* JADX INFO: renamed from: a */
    public static final Unit m71181a(final C32491Q0 c32491q0, final C32583i c32583i, C28332L c28332l) {
        C32541m c32541m;
        String str;
        AbstractC28458h.m69339a(c28332l.f57674a);
        RecyclerView recyclerView = c28332l.f57675b;
        recyclerView.setLayoutManager(new LinearLayoutManager(c28332l.f57674a.getContext()));
        C32568d c32568d = new C32568d(new Function1() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.ui.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C32583i.m71185a((AbstractC32550p) obj);
            }
        });
        List list = c32491q0.f66305c;
        if (list != null) {
            c32568d.f66426c.clear();
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                AbstractC32550p abstractC32550p = (AbstractC32550p) obj;
                if ((abstractC32550p instanceof C32541m) && (str = (c32541m = (C32541m) abstractC32550p).f66380b) != null) {
                    ArrayList arrayList = (ArrayList) c32568d.f66426c.get(str);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(Integer.valueOf(i11));
                    c32568d.f66426c.put(c32541m.f66380b, arrayList);
                }
                i11 = i12;
            }
            DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(c32568d.mo69071a(c32568d.f57292a, list));
            c32568d.f57292a.clear();
            c32568d.f57292a.addAll(list);
            diffResultCalculateDiff.dispatchUpdatesTo(c32568d);
        }
        recyclerView.setAdapter(c32568d);
        recyclerView.addItemDecoration(new C28094b(c28332l.f57674a.getContext().getResources().getDimensionPixelSize(R$dimen.sns_margin_small)));
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.setChangeDuration(0L);
        }
        c28332l.f57676c.setText(c32491q0.f66304b);
        C28351p c28351p = c32583i.f66451a;
        if (c28351p != null) {
            SNSPrimaryButton sNSPrimaryButton = c28351p.f57776b;
            sNSPrimaryButton.setVisibility(0);
            sNSPrimaryButton.setText(c32491q0.f66303a);
            AbstractC28467k.m69368a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.ui.p
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C32583i.m71190a(this.f66468b, c32491q0);
                }
            }, sNSPrimaryButton);
            sNSPrimaryButton.setEnabled(true);
        }
        C28351p c28351p2 = c32583i.f66451a;
        if (c28351p2 != null) {
            c28351p2.f57778d.setVisibility(8);
        }
        C28351p c28351p3 = c32583i.f66451a;
        if (c28351p3 != null) {
            c28351p3.f57779e.setOptionButtonVisible(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static final Unit m71196b(C32492R0 c32492r0, C32583i c32583i, C28333M c28333m) {
        SNSPrimaryButton sNSPrimaryButton;
        String str = c32492r0.f66310d;
        if (!Intrinsics.areEqual(String.valueOf(c28333m.f57679c.getText()), str)) {
            c28333m.f57679c.setText(str);
            c28333m.f57679c.setSelection(str != null ? str.length() : 0);
        }
        c28333m.f57678b.setError(c32492r0.f66311e);
        C28351p c28351p = c32583i.f66451a;
        if (c28351p != null && (sNSPrimaryButton = c28351p.f57776b) != null) {
            sNSPrimaryButton.setText(c32492r0.f66312f);
            sNSPrimaryButton.setEnabled(c32492r0.f66313g);
        }
        return Unit.INSTANCE;
    }

    public C32583i(C28351p c28351p, Function0 function0, C32559t c32559t, Function0 function1, Function0 function2) {
        ConstraintLayout constraintLayout;
        this.f66451a = c28351p;
        this.f66452b = function0;
        this.f66453c = c32559t;
        this.f66454d = function1;
        this.f66455e = function2;
        if (c28351p != null) {
            constraintLayout = c28351p.f57777c;
        } else {
            constraintLayout = null;
        }
        this.f66457g = new C28972f(constraintLayout, new Function2() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.ui.x
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C32583i.m71194a(this.f66484b, (AbstractC32498U0) obj, (AbstractC32498U0) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static final Unit m71199b(C32583i c32583i, C32492R0 c32492r0) {
        c32583i.m71206a(c32492r0.f66317k);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static final Unit m71197b(C32583i c32583i, C32489P0 c32489p0) {
        c32583i.m71206a(c32489p0.f66297n);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static final Unit m71198b(C32583i c32583i, C32489P0 c32489p0, String str) {
        c32583i.f66453c.invoke(c32489p0.f66294k.invoke(str));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public final void m71207b() {
        PermissionRequest permissionRequest;
        WeakReference weakReference = this.f66456f;
        if (weakReference != null && (permissionRequest = (PermissionRequest) weakReference.get()) != null) {
            permissionRequest.grant(new String[]{"android.webkit.resource.VIDEO_CAPTURE"});
        }
        this.f66456f = null;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71183a(final C32494S0 c32494s0, final C32583i c32583i, C28334N c28334n) {
        SNSToolbarView sNSToolbarView;
        SNSSecondaryButton sNSSecondaryButton;
        SNSPrimaryButton sNSPrimaryButton;
        AbstractC28458h.m69339a(c28334n.f57682a);
        AbstractC28458h.m69341a(c28334n.f57684c, c32494s0.f66319a);
        AbstractC28458h.m69341a(c28334n.f57683b, c32494s0.f66320b);
        C28351p c28351p = c32583i.f66451a;
        if (c28351p != null && (sNSPrimaryButton = c28351p.f57776b) != null) {
            sNSPrimaryButton.setVisibility(0);
            sNSPrimaryButton.setText(c32494s0.f66321c);
            AbstractC28467k.m69368a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.ui.t
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C32583i.m71193a(this.f66476b, c32494s0);
                }
            }, sNSPrimaryButton);
            sNSPrimaryButton.setEnabled(true);
        }
        C28351p c28351p2 = c32583i.f66451a;
        if (c28351p2 != null && (sNSSecondaryButton = c28351p2.f57778d) != null) {
            sNSSecondaryButton.setVisibility(8);
        }
        C28351p c28351p3 = c32583i.f66451a;
        if (c28351p3 != null && (sNSToolbarView = c28351p3.f57779e) != null) {
            sNSToolbarView.setOptionButtonVisible(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71194a(C32583i c32583i, AbstractC32498U0 abstractC32498U0, AbstractC32498U0 abstractC32498U1) {
        C28367f c28367f = (C28367f) c32583i.f66452b.invoke();
        C28367f.m69261b(c28367f.f57840a, c28367f.f57841b, c28367f.f57842c, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final C28333M m71202a(final C32492R0 c32492r0) {
        return (C28333M) this.f66457g.m69713a(c32492r0, C32576c.f66441a, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.ui.z
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C32583i.m71182a(c32492r0, this, (C28333M) obj);
            }
        }, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.ui.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C32583i.m71196b(c32492r0, this, (C28333M) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71182a(final C32492R0 c32492r0, final C32583i c32583i, C28333M c28333m) {
        c28333m.f57679c.addTextChangedListener(new C32578d(c32492r0, c32583i, c28333m));
        AbstractC28458h.m69341a(c28333m.f57681e, c32492r0.f66307a);
        SNSSubtitle2TextView sNSSubtitle2TextView = c28333m.f57680d;
        CharSequence charSequence = c32492r0.f66308b;
        AbstractC28458h.m69341a(sNSSubtitle2TextView, charSequence != null ? AbstractC28462i0.m69364a(charSequence, c28333m.f57677a.getContext()) : null);
        AbstractC28485q.m69381a(c28333m.f57680d, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.ui.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C32583i.m71192a(this.f66470b, c32492r0, (String) obj);
            }
        });
        c28333m.f57679c.setHint(c32492r0.f66309c);
        String str = c32492r0.f66310d;
        if (str == null || StringsKt.isBlank(str)) {
            AbstractC28458h.m69356f(c28333m.f57679c);
        }
        C28351p c28351p = c32583i.f66451a;
        if (c28351p != null) {
            SNSPrimaryButton sNSPrimaryButton = c28351p.f57776b;
            sNSPrimaryButton.setVisibility(0);
            AbstractC28467k.m69368a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.ui.r
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C32583i.m71191a(this.f66472b, c32492r0);
                }
            }, sNSPrimaryButton);
        }
        C28351p c28351p2 = c32583i.f66451a;
        if (c28351p2 != null) {
            SNSSecondaryButton sNSSecondaryButton = c28351p2.f57778d;
            sNSSecondaryButton.setVisibility(0);
            sNSSecondaryButton.setText(c32492r0.f66314h);
            AbstractC28467k.m69368a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.ui.s
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C32583i.m71199b(this.f66474b, c32492r0);
                }
            }, sNSSecondaryButton);
        }
        C28351p c28351p3 = c32583i.f66451a;
        if (c28351p3 != null) {
            c28351p3.f57779e.setOptionButtonVisible(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final void m71206a(C32520f c32520f) {
        Control control = c32520f.f66343a;
        if (control != null) {
            C28367f.m69256a((C28367f) this.f66452b.invoke(), control, (Map) null, (Popup) null, 6);
        }
        this.f66453c.invoke(c32520f.f66344b);
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71191a(C32583i c32583i, C32492R0 c32492r0) {
        c32583i.m71206a(c32492r0.f66316j);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71192a(C32583i c32583i, C32492R0 c32492r0, String str) {
        c32583i.m71206a(c32492r0.f66318l);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71180a(final C32489P0 c32489p0, final C32583i c32583i, final C28331K c28331k) {
        SNSToolbarView sNSToolbarView;
        SNSSecondaryButton sNSSecondaryButton;
        SNSPrimaryButton sNSPrimaryButton;
        AbstractC28458h.m69339a(c28331k.f57662a);
        AbstractC28458h.m69341a(c28331k.f57673l, c32489p0.f66284a);
        AbstractC28458h.m69341a(c28331k.f57665d, c32489p0.f66285b);
        SNSTextView sNSTextView = c28331k.f57672k;
        CharSequence charSequence = c32489p0.f66291h;
        sNSTextView.setText(charSequence != null ? AbstractC28462i0.m69364a(charSequence, c28331k.f57662a.getContext()) : null);
        AbstractC28485q.m69381a(c28331k.f57672k, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.ui.b0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C32583i.m71189a(this.f66439b, c32489p0, (String) obj);
            }
        });
        SNSTextView sNSTextView2 = c28331k.f57664c;
        CharSequence charSequence2 = c32489p0.f66292i;
        sNSTextView2.setText(charSequence2 != null ? AbstractC28462i0.m69364a(charSequence2, c28331k.f57662a.getContext()) : null);
        AbstractC28485q.m69381a(c28331k.f57664c, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.ui.c0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C32583i.m71198b(this.f66442b, c32489p0, (String) obj);
            }
        });
        c28331k.f57663b.setChecked(c32489p0.f66293j);
        final Function2 function2 = new Function2() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.ui.k
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C32583i.m71188a(this.f66460b, c32489p0, c28331k, (CompoundButton) obj, ((Boolean) obj2).booleanValue());
            }
        };
        c28331k.f57663b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.ui.l
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                C32583i.m71195a(function2, compoundButton, z11);
            }
        });
        c28331k.f57669h.setText(c32489p0.f66288e);
        c28331k.f57671j.setText(c32489p0.f66289f);
        c28331k.f57670i.setText(c32489p0.f66290g);
        ImageView imageView = c28331k.f57666e;
        Context context = imageView.getContext();
        String imageName = SNSIconHandler.SNSCommonIcons.INSTANT_ACTION.getImageName();
        C28468k0 c28468k0 = C28468k0.f57983a;
        imageView.setImageDrawable(c28468k0.getIconHandler().onResolveIcon(context, imageName));
        Integer numM69174a = AbstractC28234b.m69174a(imageView, SNSColorElement.CONTENT_WARNING);
        imageView.setImageTintList(ColorStateList.valueOf(numM69174a != null ? numM69174a.intValue() : ContextCompat.getColor(imageView.getContext(), R$color.sns_contentWarning)));
        ImageView imageView2 = c28331k.f57668g;
        imageView2.setImageDrawable(c28468k0.getIconHandler().onResolveIcon(imageView2.getContext(), SNSIconHandler.SNSCommonIcons.LOCK.getImageName()));
        Integer numM69174a2 = AbstractC28234b.m69174a(imageView2, SNSColorElement.CONTENT_INFO);
        imageView2.setImageTintList(ColorStateList.valueOf(numM69174a2 != null ? numM69174a2.intValue() : ContextCompat.getColor(imageView2.getContext(), R$color.sns_contentInfo)));
        ImageView imageView3 = c28331k.f57667f;
        imageView3.setImageDrawable(c28468k0.getIconHandler().onResolveIcon(imageView3.getContext(), SNSIconHandler.SNSCommonIcons.SUCCESS_FILLED.getImageName()));
        Integer numM69174a3 = AbstractC28234b.m69174a(imageView3, SNSColorElement.CONTENT_SUCCESS);
        imageView3.setImageTintList(ColorStateList.valueOf(numM69174a3 != null ? numM69174a3.intValue() : ContextCompat.getColor(imageView3.getContext(), R$color.sns_contentSuccess)));
        C28351p c28351p = c32583i.f66451a;
        if (c28351p != null && (sNSPrimaryButton = c28351p.f57776b) != null) {
            sNSPrimaryButton.setVisibility(0);
            sNSPrimaryButton.setText(c32489p0.f66286c);
            AbstractC28467k.m69368a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.ui.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C32583i.m71186a(this.f66464b, c32489p0);
                }
            }, sNSPrimaryButton);
            sNSPrimaryButton.setEnabled(false);
        }
        C28351p c28351p2 = c32583i.f66451a;
        if (c28351p2 != null && (sNSSecondaryButton = c28351p2.f57778d) != null) {
            sNSSecondaryButton.setVisibility(0);
            sNSSecondaryButton.setText(c32489p0.f66287d);
            AbstractC28467k.m69368a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.ui.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C32583i.m71197b(this.f66466b, c32489p0);
                }
            }, sNSSecondaryButton);
        }
        C28351p c28351p3 = c32583i.f66451a;
        if (c28351p3 != null && (sNSToolbarView = c28351p3.f57779e) != null) {
            sNSToolbarView.setOptionButtonVisible(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71193a(C32583i c32583i, C32494S0 c32494s0) {
        c32583i.m71206a(c32494s0.f66322d);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final C28334N m71203a(final C32494S0 c32494s0) {
        return (C28334N) this.f66457g.m69713a(c32494s0, C32579e.f66447a, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.ui.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C32583i.m71183a(c32494s0, this, (C28334N) obj);
            }
        }, null);
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71186a(C32583i c32583i, C32489P0 c32489p0) {
        c32583i.m71206a(c32489p0.f66296m);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71190a(C32583i c32583i, C32491Q0 c32491q0) {
        c32583i.m71206a(c32491q0.f66306d);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final C28331K m71200a(final C32489P0 c32489p0) {
        return (C28331K) this.f66457g.m69713a(c32489p0, C32563a.f66419a, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.ui.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C32583i.m71180a(c32489p0, this, (C28331K) obj);
            }
        }, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.ui.v
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C32583i.m71187a(this.f66480b, c32489p0, (C28331K) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71189a(C32583i c32583i, C32489P0 c32489p0, String str) {
        c32583i.f66453c.invoke(c32489p0.f66294k.invoke(str));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71188a(C32583i c32583i, C32489P0 c32489p0, C28331K c28331k, CompoundButton compoundButton, boolean z11) {
        c32583i.f66453c.invoke(c32489p0.f66295l.invoke(Boolean.valueOf(c28331k.f57663b.isChecked())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final void m71195a(Function2 function2, CompoundButton compoundButton, boolean z11) {
        function2.invoke(compoundButton, Boolean.valueOf(z11));
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71187a(C32583i c32583i, C32489P0 c32489p0, C28331K c28331k) {
        SNSPrimaryButton sNSPrimaryButton;
        C28351p c28351p = c32583i.f66451a;
        if (c28351p != null && (sNSPrimaryButton = c28351p.f57776b) != null) {
            sNSPrimaryButton.setEnabled(c32489p0.f66293j);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final C28332L m71201a(final C32491Q0 c32491q0) {
        return (C28332L) this.f66457g.m69713a(c32491q0, C32574b.f66438a, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.ui.w
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C32583i.m71181a(c32491q0, this, (C28332L) obj);
            }
        }, null);
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71185a(AbstractC32550p abstractC32550p) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final C28335O m71204a(final C32496T0 c32496t0) {
        return (C28335O) this.f66457g.m69713a(c32496t0, C32580f.f66448a, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.sumsubid.ui.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C32583i.m71184a(c32496t0, this, (C28335O) obj);
            }
        }, null);
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71184a(C32496T0 c32496t0, C32583i c32583i, C28335O c28335o) {
        CookieManager.getInstance().setCookie(c32496t0.f66325b, c32496t0.f66326c);
        WebView webView = c28335o.f57686b;
        webView.setWebViewClient(new C32581g());
        webView.setWebChromeClient(new C32582h(c32583i, c32496t0));
        webView.getSettings().setSupportMultipleWindows(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(c32496t0.f66324a);
        C28351p c28351p = c32583i.f66451a;
        if (c28351p != null) {
            c28351p.f57776b.setVisibility(8);
        }
        C28351p c28351p2 = c32583i.f66451a;
        if (c28351p2 != null) {
            c28351p2.f57778d.setVisibility(8);
        }
        C28351p c28351p3 = c32583i.f66451a;
        if (c28351p3 != null) {
            c28351p3.f57779e.setOptionButtonVisible(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final void m71205a() {
        PermissionRequest permissionRequest;
        WeakReference weakReference = this.f66456f;
        if (weakReference != null && (permissionRequest = (PermissionRequest) weakReference.get()) != null) {
            permissionRequest.deny();
        }
        this.f66456f = null;
    }
}
