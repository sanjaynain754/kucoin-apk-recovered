package com.kubi.mine.lib.nps;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5303w0;
import com.kubi.mine.R$id;
import com.kubi.mine.R$layout;
import com.kubi.mine.lib.entity.NPSCollectParam;
import com.kubi.mine.lib.entity.NPSOption;
import com.kubi.mine.lib.entity.NPSParamAnswer;
import com.kubi.mine.lib.entity.NPSParamOption;
import com.kubi.mine.lib.entity.NPSQuestion;
import com.kubi.mine.lib.entity.NPSQuestionEntity;
import com.kubi.mine.lib.entity.NPSSurvey;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.resources.C22912t;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p319hq.InterfaceC38286c;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NPSLite.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bJ%\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0017J\u0018\u0010\u0018\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J \u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0018\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J \u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\"\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, m90084d2 = {"Lcom/kubi/mine/lib/nps/NPSLite;", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", "<init>", "(Lcom/kubi/sdk/BaseFragment;)V", "api", "Lcom/kubi/mine/lib/api/NPSApi;", "currentInputInfo", "", "successCallback", "Lkotlin/Function0;", "", InterfaceC33617e1.f69659h, TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/mine/lib/entity/NPSQuestionEntity;", "success", "dialogFragment", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "setupView", C33954u6.f72238i, "Lio/chad/library/adapter/base/BaseViewHolder;", "dialogFragmentHelper", "setupView$MineLib_googleRelease", "fillCustomInputMsg", "fillScores", "question1", "Lcom/kubi/mine/lib/entity/NPSQuestion;", "context", "Landroid/content/Context;", "fillTitle", "submit", "btn", "Lcom/kubi/resources/widget/button/KcPrimaryButton;", "alertThanks", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNPSLite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NPSLite.kt\ncom/kubi/mine/lib/nps/NPSLite\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,253:1\n2756#2:254\n543#2,6:256\n1878#2,3:262\n1#3:255\n*S KotlinDebug\n*F\n+ 1 NPSLite.kt\ncom/kubi/mine/lib/nps/NPSLite\n*L\n172#1:254\n200#1:256,6\n157#1:262,3\n172#1:255\n*E\n"})
public final class NPSLite {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final BaseFragment f35130a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC38286c f35131b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public String f35132c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public Function0<Unit> f35133d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public DialogFragmentHelper f35134e;

    /* JADX INFO: renamed from: com.kubi.mine.lib.nps.NPSLite$a */
    /* JADX INFO: compiled from: NPSLite.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/mine/lib/nps/NPSLite$fillCustomInputMsg$1$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onPreDraw", "", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class ViewTreeObserverOnPreDrawListenerC18988a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TextView f35135b;

        public ViewTreeObserverOnPreDrawListenerC18988a(TextView textView) {
            this.f35135b = textView;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            final TextView textView = this.f35135b;
            C27100x0.m66924e(new Function0() { // from class: com.kubi.mine.lib.nps.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NPSLite.ViewTreeObserverOnPreDrawListenerC18988a.m41810b(textView, this);
                }
            });
            return false;
        }

        /* JADX INFO: renamed from: b */
        public static final Unit m41810b(TextView textView, ViewTreeObserverOnPreDrawListenerC18988a viewTreeObserverOnPreDrawListenerC18988a) {
            float f11;
            ViewTreeObserver viewTreeObserver = textView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC18988a);
            }
            if (textView.getLineCount() > 3) {
                f11 = 12.0f;
            } else {
                f11 = 16.0f;
            }
            textView.setTextSize(2, f11);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.mine.lib.nps.NPSLite$b */
    /* JADX INFO: compiled from: NPSLite.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/mine/lib/nps/NPSLite$fillTitle$2$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onPreDraw", "", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class ViewTreeObserverOnPreDrawListenerC18989b implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TextView f35136b;

        public ViewTreeObserverOnPreDrawListenerC18989b(TextView textView) {
            this.f35136b = textView;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            final TextView textView = this.f35136b;
            C27100x0.m66924e(new Function0() { // from class: com.kubi.mine.lib.nps.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NPSLite.ViewTreeObserverOnPreDrawListenerC18989b.m41812b(textView, this);
                }
            });
            return false;
        }

        /* JADX INFO: renamed from: b */
        public static final Unit m41812b(TextView textView, ViewTreeObserverOnPreDrawListenerC18989b viewTreeObserverOnPreDrawListenerC18989b) {
            float f11;
            ViewTreeObserver viewTreeObserver = textView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC18989b);
            }
            if (textView.getLineCount() > 2) {
                f11 = 16.0f;
            } else {
                f11 = 20.0f;
            }
            textView.setTextSize(2, f11);
            return Unit.INSTANCE;
        }
    }

    public NPSLite(@NotNull BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f35130a = fragment;
        this.f35131b = (InterfaceC38286c) RetrofitFlowExKt.m42820a(InterfaceC38286c.class);
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m41794n(BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        View view = viewHolder.getView(R$id.btnIknow);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.mine.lib.nps.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NPSLite.m41795o(dialogFragmentHelper);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m41796q(final NPSLite nPSLite, final BaseViewHolder baseViewHolder, final CharSequence charSequence) {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.mine.lib.nps.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NPSLite.m41797r(this.f35149b, charSequence, baseViewHolder);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m41800x(NPSLite nPSLite, NPSQuestionEntity nPSQuestionEntity, BaseViewHolder viewHolder, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        nPSLite.m41808y(viewHolder, dialogFragmentHelper, nPSQuestionEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public final void m41803m() {
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.bmine_dialog_content_nps_thanks, -1, 0, 0, false, false, false, false, false, 508, null).m54237f4(new Function2() { // from class: com.kubi.mine.lib.nps.c
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NPSLite.m41794n((BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        dialogFragmentHelperM54237f4.setCancelable(false);
        FragmentManager childFragmentManager = this.f35130a.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM54237f4.show(childFragmentManager, "showThanksAlert");
    }

    /* JADX INFO: renamed from: w */
    public final void m41807w(@Nullable final NPSQuestionEntity nPSQuestionEntity, @Nullable Function0<Unit> function0) {
        this.f35133d = function0;
        if (C27025c.m66566d(nPSQuestionEntity != null ? nPSQuestionEntity.getCollected() : null)) {
            m41803m();
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        if (nPSQuestionEntity == null || nPSQuestionEntity.question1() == null) {
            return;
        }
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.f43568p0.newInstance(R$layout.bmine_dialog_content_nps, true).m54237f4(new Function2() { // from class: com.kubi.mine.lib.nps.a
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NPSLite.m41800x(this.f35137b, nPSQuestionEntity, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        FragmentManager childFragmentManager = this.f35130a.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM54237f4.show(childFragmentManager, "NPSLite");
    }

    /* JADX INFO: renamed from: y */
    public final void m41808y(@NotNull BaseViewHolder holder, @NotNull final DialogFragmentHelper dialogFragmentHelper, @NotNull final NPSQuestionEntity entity) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        Intrinsics.checkNotNullParameter(entity, "entity");
        Context context = holder.itemView.getContext();
        this.f35134e = dialogFragmentHelper;
        NPSQuestion nPSQuestionQuestion1 = entity.question1();
        if (nPSQuestionQuestion1 == null) {
            return;
        }
        m41806v(nPSQuestionQuestion1, holder);
        Intrinsics.checkNotNull(context);
        m41805t(nPSQuestionQuestion1, holder, context);
        m41804p(entity, holder);
        final KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) holder.getView(R$id.btnSubmit);
        if (kcPrimaryButton != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.mine.lib.nps.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NPSLite.m41801z(this.f35139b, kcPrimaryButton, dialogFragmentHelper, entity);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m41795o(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m41797r(NPSLite nPSLite, CharSequence charSequence, BaseViewHolder baseViewHolder) {
        nPSLite.f35132c = charSequence.toString();
        if (C5303w0.m6511a()) {
            baseViewHolder.setText(R$id.tvWordsCount, "200/" + charSequence.length());
        } else {
            baseViewHolder.setText(R$id.tvWordsCount, charSequence.length() + "/200");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final void m41798s(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: u */
    public static final void m41799u(NPSLite$fillScores$scoreAdapter$1 nPSLite$fillScores$scoreAdapter$1, BaseViewHolder baseViewHolder, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        List<NPSOption> data = nPSLite$fillScores$scoreAdapter$1.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        Iterator<T> it = data.iterator();
        int i12 = 0;
        while (true) {
            boolean z11 = true;
            if (it.hasNext()) {
                Object next = it.next();
                int i13 = i12 + 1;
                if (i12 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                NPSOption nPSOption = (NPSOption) next;
                if (i12 != i11) {
                    z11 = false;
                }
                nPSOption.setSelected(z11);
                i12 = i13;
            } else {
                nPSLite$fillScores$scoreAdapter$1.notifyItemRangeChanged(0, nPSLite$fillScores$scoreAdapter$1.getData().size());
                baseViewHolder.setEnabled(R$id.btnSubmit, true);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m41801z(NPSLite nPSLite, KcPrimaryButton kcPrimaryButton, DialogFragmentHelper dialogFragmentHelper, NPSQuestionEntity nPSQuestionEntity) {
        nPSLite.m41802A(kcPrimaryButton, dialogFragmentHelper, nPSQuestionEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final void m41802A(KcPrimaryButton kcPrimaryButton, DialogFragmentHelper dialogFragmentHelper, NPSQuestionEntity nPSQuestionEntity) {
        NPSOption nPSOption;
        Long questionId;
        Boolean boolValueOf;
        Integer sort;
        Integer type;
        List<NPSOption> options;
        NPSOption nPSOptionPrevious;
        NPSQuestion nPSQuestionQuestion1 = nPSQuestionEntity.question1();
        NPSQuestion nPSQuestionQuestion2 = nPSQuestionEntity.question2();
        ArrayList arrayList = new ArrayList();
        Long id2 = null;
        if (nPSQuestionQuestion1 != null && (options = nPSQuestionQuestion1.getOptions()) != null) {
            ListIterator<NPSOption> listIterator = options.listIterator(options.size());
            do {
                if (listIterator.hasPrevious()) {
                    nPSOptionPrevious = listIterator.previous();
                } else {
                    nPSOptionPrevious = null;
                    break;
                }
            } while (!nPSOptionPrevious.getSelected());
            nPSOption = nPSOptionPrevious;
        } else {
            nPSOption = null;
        }
        if (nPSQuestionQuestion1 != null) {
            questionId = nPSQuestionQuestion1.getQuestionId();
        } else {
            questionId = null;
        }
        if (nPSOption != null) {
            boolValueOf = Boolean.valueOf(nPSOption.getSelected());
        } else {
            boolValueOf = null;
        }
        if (nPSOption != null) {
            sort = nPSOption.getSort();
        } else {
            sort = null;
        }
        List listListOf = CollectionsKt.listOf(new NPSParamOption(boolValueOf, sort));
        if (nPSQuestionQuestion1 != null) {
            type = nPSQuestionQuestion1.getType();
        } else {
            type = null;
        }
        arrayList.add(new NPSParamAnswer(null, listListOf, questionId, type, 1, null));
        if (nPSQuestionQuestion2 != null) {
            arrayList.add(new NPSParamAnswer(C27041f.m66668h(this.f35132c), null, nPSQuestionQuestion2.getQuestionId(), nPSQuestionQuestion2.getType(), 2, null));
        }
        Long deliverId = nPSQuestionEntity.getDeliverId();
        String deliverNo = nPSQuestionEntity.getDeliverNo();
        NPSSurvey survey = nPSQuestionEntity.getSurvey();
        if (survey != null) {
            id2 = survey.getId();
        }
        LifecycleOwnerKt.getLifecycleScope(this.f35130a).launchWhenStarted(new NPSLite$submit$2(this, new NPSCollectParam(arrayList, deliverId, deliverNo, id2), kcPrimaryButton, dialogFragmentHelper, null));
    }

    /* JADX INFO: renamed from: p */
    public final void m41804p(NPSQuestionEntity nPSQuestionEntity, final BaseViewHolder baseViewHolder) {
        boolean z11;
        boolean z12;
        String title;
        NPSQuestion nPSQuestionQuestion2 = nPSQuestionEntity.question2();
        int i11 = R$id.layoutInput;
        boolean z13 = false;
        if (nPSQuestionQuestion2 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        baseViewHolder.setGone(i11, z11);
        TextView textView = (TextView) baseViewHolder.getView(R$id.tvMoreInfoTitle);
        if (textView != null) {
            if (nPSQuestionQuestion2 != null) {
                ViewExtKt.m66594y(textView);
            } else {
                ViewExtKt.m66577h(textView);
            }
            if (ViewExtKt.m66581l(textView)) {
                textView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC18988a(textView));
            }
            if (nPSQuestionQuestion2 != null) {
                title = nPSQuestionQuestion2.getTitle();
            } else {
                title = null;
            }
            textView.setText(C27041f.m66668h(title));
        }
        EditText editText = (EditText) baseViewHolder.getView(R$id.etMoreInfoInput);
        if (editText != null) {
            Observable<CharSequence> observableObserveOn = C0206f.m784d(editText).observeOn(AndroidSchedulers.mainThread());
            final Function1 function1 = new Function1() { // from class: com.kubi.mine.lib.nps.e
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NPSLite.m41796q(this.f35145b, baseViewHolder, (CharSequence) obj);
                }
            };
            Disposable disposableSubscribe = observableObserveOn.subscribe(new Consumer() { // from class: com.kubi.mine.lib.nps.f
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    NPSLite.m41798s(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, this.f35130a.getDestroyDisposable());
        }
        int i12 = R$id.tvThanksMsg;
        if (nPSQuestionQuestion2 != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        baseViewHolder.setGone(i12, z12);
        int i13 = R$id.tvThanksTips;
        if (nPSQuestionQuestion2 != null) {
            z13 = true;
        }
        baseViewHolder.setGone(i13, z13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.recyclerview.widget.RecyclerView$Adapter, com.kubi.mine.lib.nps.NPSLite$fillScores$scoreAdapter$1, io.chad.library.adapter.base.BaseQuickAdapter] */
    /* JADX INFO: renamed from: t */
    public final void m41805t(NPSQuestion nPSQuestion, final BaseViewHolder baseViewHolder, Context context) {
        Integer numValueOf;
        List<NPSOption> options = nPSQuestion.getOptions();
        if (options != null) {
            numValueOf = Integer.valueOf(options.size());
        } else {
            numValueOf = null;
        }
        int iM66650j = C27039d.m66650j(numValueOf);
        RecyclerView recyclerView = (RecyclerView) baseViewHolder.getView(R$id.recyclerView);
        if (recyclerView == 0) {
            return;
        }
        recyclerView.setLayoutManager(new GridLayoutManager(context, iM66650j));
        recyclerView.addItemDecoration(new NPSSCoreItemDecoration(C27029c.m66598a(context, 4.0f)));
        final int i11 = R$layout.bmine_item_nps_score;
        final ?? r11 = new BaseQuickAdapter<NPSOption, BaseViewHolder>(i11) { // from class: com.kubi.mine.lib.nps.NPSLite$fillScores$scoreAdapter$1
            @Override // io.chad.library.adapter.base.BaseQuickAdapter
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public void convert(BaseViewHolder baseViewHolder2, NPSOption nPSOption) {
                TextView textView;
                if (baseViewHolder2 == null || (textView = (TextView) baseViewHolder2.getView(R$id.tvScore)) == null) {
                    return;
                }
                textView.setText(String.valueOf(baseViewHolder2.getAdapterPosition()));
                textView.setSelected(C27025c.m66566d(nPSOption != null ? Boolean.valueOf(nPSOption.getSelected()) : null));
            }
        };
        r11.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.mine.lib.nps.d
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i12) {
                NPSLite.m41799u(r11, baseViewHolder, baseQuickAdapter, view, i12);
            }
        });
        recyclerView.setAdapter(r11);
        C22912t.m54409g(recyclerView, false);
        r11.setNewData(nPSQuestion.getOptions());
    }

    /* JADX INFO: renamed from: v */
    public final void m41806v(NPSQuestion nPSQuestion, BaseViewHolder baseViewHolder) {
        String optionName;
        NPSOption nPSOption;
        NPSOption nPSOption2;
        List<NPSOption> options = nPSQuestion.getOptions();
        if (options != null) {
            Iterator<T> it = options.iterator();
            while (it.hasNext()) {
                ((NPSOption) it.next()).setSelected(false);
            }
        }
        TextView textView = (TextView) baseViewHolder.getView(R$id.tvTitle);
        if (textView != null) {
            textView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC18989b(textView));
            textView.setText(nPSQuestion.getTitle());
        }
        int i11 = R$id.tvLow;
        List<NPSOption> options2 = nPSQuestion.getOptions();
        String optionName2 = null;
        if (options2 != null && (nPSOption2 = (NPSOption) CollectionsKt.firstOrNull((List) options2)) != null) {
            optionName = nPSOption2.getOptionName();
        } else {
            optionName = null;
        }
        baseViewHolder.setText(i11, optionName);
        int i12 = R$id.tvHigh;
        List<NPSOption> options3 = nPSQuestion.getOptions();
        if (options3 != null && (nPSOption = (NPSOption) CollectionsKt.lastOrNull((List) options3)) != null) {
            optionName2 = nPSOption.getOptionName();
        }
        baseViewHolder.setText(i12, optionName2);
    }
}
