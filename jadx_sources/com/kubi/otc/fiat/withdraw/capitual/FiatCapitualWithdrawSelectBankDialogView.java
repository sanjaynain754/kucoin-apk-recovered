package com.kubi.otc.fiat.withdraw.capitual;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5275i0;
import com.blankj.utilcode.util.KeyboardUtils;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.entity.FiatCapitualBank;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p752x8.AbstractC46099a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: FiatCapitualWithdrawSelectBankDialogView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\r\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/otc/fiat/withdraw/capitual/FiatCapitualWithdrawSelectBankDialogView;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "selectBankNo", "", "datas", "", "Lcom/kubi/otc/entity/FiatCapitualBank;", "callBack", "Lio/reactivex/functions/BiConsumer;", "Lio/chad/library/adapter/base/BaseViewHolder;", "adapter", "com/kubi/otc/fiat/withdraw/capitual/FiatCapitualWithdrawSelectBankDialogView$adapter$2$1", "getAdapter", "()Lcom/kubi/otc/fiat/withdraw/capitual/FiatCapitualWithdrawSelectBankDialogView$adapter$2$1;", "adapter$delegate", "Lkotlin/Lazy;", TIMPushProvider.f75062n, "", "manager", "Landroidx/fragment/app/FragmentManager;", "tag", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
@SourceDebugExtension({"SMAP\nFiatCapitualWithdrawSelectBankDialogView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FiatCapitualWithdrawSelectBankDialogView.kt\ncom/kubi/otc/fiat/withdraw/capitual/FiatCapitualWithdrawSelectBankDialogView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,120:1\n865#2,2:121\n*S KotlinDebug\n*F\n+ 1 FiatCapitualWithdrawSelectBankDialogView.kt\ncom/kubi/otc/fiat/withdraw/capitual/FiatCapitualWithdrawSelectBankDialogView\n*L\n83#1:121,2\n*E\n"})
public final class FiatCapitualWithdrawSelectBankDialogView extends DialogFragmentHelper {

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public static final Companion f37517u0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @Nullable
    public String f37518q0;

    /* JADX INFO: renamed from: r0 */
    @Nullable
    public List<FiatCapitualBank> f37519r0;

    /* JADX INFO: renamed from: s0 */
    @Nullable
    public BiConsumer<BaseViewHolder, FiatCapitualBank> f37520s0;

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f37521t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.withdraw.capitual.y
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatCapitualWithdrawSelectBankDialogView.m44631w4(this.f37575b);
        }
    });

    /* JADX INFO: compiled from: FiatCapitualWithdrawSelectBankDialogView.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/otc/fiat/withdraw/capitual/FiatCapitualWithdrawSelectBankDialogView$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "selectBankNo", "", "datas", "", "Lcom/kubi/otc/entity/FiatCapitualBank;", "callBack", "Lio/reactivex/functions/BiConsumer;", "Lio/chad/library/adapter/base/BaseViewHolder;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final DialogFragmentHelper newInstance(@NotNull String selectBankNo, @NotNull List<FiatCapitualBank> datas, @NotNull BiConsumer<BaseViewHolder, FiatCapitualBank> callBack) {
            Intrinsics.checkNotNullParameter(selectBankNo, "selectBankNo");
            Intrinsics.checkNotNullParameter(datas, "datas");
            Intrinsics.checkNotNullParameter(callBack, "callBack");
            FiatCapitualWithdrawSelectBankDialogView fiatCapitualWithdrawSelectBankDialogView = new FiatCapitualWithdrawSelectBankDialogView();
            fiatCapitualWithdrawSelectBankDialogView.f37518q0 = selectBankNo;
            fiatCapitualWithdrawSelectBankDialogView.f37519r0 = datas;
            fiatCapitualWithdrawSelectBankDialogView.f37520s0 = callBack;
            Bundle bundle = new Bundle();
            bundle.putInt(TtmlNode.TAG_LAYOUT, R$layout.botc_dialog_select_label_view);
            fiatCapitualWithdrawSelectBankDialogView.setArguments(bundle);
            return fiatCapitualWithdrawSelectBankDialogView;
        }
    }

    /* JADX INFO: renamed from: p4 */
    public static final Unit m44624p4(final FiatCapitualWithdrawSelectBankDialogView fiatCapitualWithdrawSelectBankDialogView, BaseViewHolder viewHolder, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "<unused var>");
        RecyclerView recyclerView = (RecyclerView) viewHolder.getView(R$id.recycler_view);
        final ClearEditText clearEditText = (ClearEditText) viewHolder.getView(R$id.et_search);
        final FiatCapitualWithdrawSelectBankDialogView$adapter$2$1 fiatCapitualWithdrawSelectBankDialogView$adapter$2$1M44632x4 = fiatCapitualWithdrawSelectBankDialogView.m44632x4();
        AbstractC46099a<CharSequence> abstractC46099aM784d = C0206f.m784d(clearEditText);
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.fiat.withdraw.capitual.b0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FiatCapitualWithdrawSelectBankDialogView.m44623o4(fiatCapitualWithdrawSelectBankDialogView$adapter$2$1M44632x4, fiatCapitualWithdrawSelectBankDialogView, (CharSequence) obj);
            }
        };
        Disposable disposableSubscribe = abstractC46099aM784d.subscribe(new Consumer() { // from class: com.kubi.otc.fiat.withdraw.capitual.c0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FiatCapitualWithdrawSelectBankDialogView.m44619k4(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, fiatCapitualWithdrawSelectBankDialogView.getF43550U());
        recyclerView.setAdapter(fiatCapitualWithdrawSelectBankDialogView$adapter$2$1M44632x4);
        recyclerView.setOnTouchListener(new View.OnTouchListener() { // from class: com.kubi.otc.fiat.withdraw.capitual.d0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return FiatCapitualWithdrawSelectBankDialogView.m44620l4(this.f37534b, clearEditText, view, motionEvent);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m44625q4(BaseViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        RecyclerView recyclerView = (RecyclerView) viewHolder.getView(R$id.recycler_view);
        int iM6237b = C5275i0.m6237b(recyclerView);
        if (iM6237b > C5267e0.m6182d() / 2) {
            recyclerView.getLayoutParams().height = C5267e0.m6182d() / 2;
        } else {
            recyclerView.getLayoutParams().height = iM6237b;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w4 */
    public static final FiatCapitualWithdrawSelectBankDialogView$adapter$2$1 m44631w4(FiatCapitualWithdrawSelectBankDialogView fiatCapitualWithdrawSelectBankDialogView) {
        return new FiatCapitualWithdrawSelectBankDialogView$adapter$2$1(fiatCapitualWithdrawSelectBankDialogView, R$layout.botc_view_item_select_capitual_bank);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment
    public void show(@NotNull FragmentManager manager, @Nullable String tag) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        if (manager.findFragmentByTag(tag) != null) {
            return;
        }
        super.show(manager, tag);
    }

    /* JADX INFO: renamed from: x4 */
    public final FiatCapitualWithdrawSelectBankDialogView$adapter$2$1 m44632x4() {
        return (FiatCapitualWithdrawSelectBankDialogView$adapter$2$1) this.f37521t0.getValue();
    }

    public FiatCapitualWithdrawSelectBankDialogView() {
        m54237f4(new Function2() { // from class: com.kubi.otc.fiat.withdraw.capitual.z
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FiatCapitualWithdrawSelectBankDialogView.m44624p4(this.f37576b, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        m54238g4(new Function1() { // from class: com.kubi.otc.fiat.withdraw.capitual.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FiatCapitualWithdrawSelectBankDialogView.m44625q4((BaseViewHolder) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public static void m44619k4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l4 */
    public static boolean m44620l4(FiatCapitualWithdrawSelectBankDialogView fiatCapitualWithdrawSelectBankDialogView, ClearEditText clearEditText, View view, MotionEvent motionEvent) {
        if (KeyboardUtils.m6037i(fiatCapitualWithdrawSelectBankDialogView.requireActivity())) {
            KeyboardUtils.m6034f(clearEditText);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0083  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    /* JADX INFO: renamed from: o4 */
    public static Unit m44623o4(FiatCapitualWithdrawSelectBankDialogView$adapter$2$1 fiatCapitualWithdrawSelectBankDialogView$adapter$2$1, FiatCapitualWithdrawSelectBankDialogView fiatCapitualWithdrawSelectBankDialogView, CharSequence charSequence) {
        List listM66560c;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        Intrinsics.checkNotNull(charSequence);
        if (charSequence.length() == 0) {
            listM66560c = C27024b.m66560c(fiatCapitualWithdrawSelectBankDialogView.f37519r0);
        } else {
            String string = charSequence.toString();
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase = string.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            List<FiatCapitualBank> list = fiatCapitualWithdrawSelectBankDialogView.f37519r0;
            ArrayList arrayList = null;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    FiatCapitualBank fiatCapitualBank = (FiatCapitualBank) obj;
                    String ispbCode = fiatCapitualBank.getIspbCode();
                    if (ispbCode != null) {
                        Locale ROOT2 = Locale.ROOT;
                        Intrinsics.checkNotNullExpressionValue(ROOT2, "ROOT");
                        String lowerCase2 = ispbCode.toLowerCase(ROOT2);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                        if (lowerCase2 != null) {
                            boolValueOf = Boolean.valueOf(StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) lowerCase, false, 2, (Object) null));
                        } else {
                            boolValueOf = null;
                        }
                    } else {
                        boolValueOf = null;
                    }
                    if (!C27025c.m66566d(boolValueOf)) {
                        String shortName = fiatCapitualBank.getShortName();
                        if (shortName != null) {
                            Locale ROOT3 = Locale.ROOT;
                            Intrinsics.checkNotNullExpressionValue(ROOT3, "ROOT");
                            String lowerCase3 = shortName.toLowerCase(ROOT3);
                            Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
                            if (lowerCase3 != null) {
                                boolValueOf2 = Boolean.valueOf(StringsKt.contains$default((CharSequence) lowerCase3, (CharSequence) lowerCase, false, 2, (Object) null));
                            } else {
                                boolValueOf2 = null;
                            }
                        } else {
                            boolValueOf2 = null;
                        }
                        if (!C27025c.m66566d(boolValueOf2)) {
                            String name = fiatCapitualBank.getName();
                            if (name != null) {
                                Locale ROOT4 = Locale.ROOT;
                                Intrinsics.checkNotNullExpressionValue(ROOT4, "ROOT");
                                String lowerCase4 = name.toLowerCase(ROOT4);
                                Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
                                if (lowerCase4 != null) {
                                    boolValueOf3 = Boolean.valueOf(StringsKt.contains$default((CharSequence) lowerCase4, (CharSequence) lowerCase, false, 2, (Object) null));
                                } else {
                                    boolValueOf3 = null;
                                }
                            } else {
                                boolValueOf3 = null;
                            }
                            if (C27025c.m66566d(boolValueOf3)) {
                            }
                        }
                    }
                    arrayList2.add(obj);
                }
                arrayList = arrayList2;
            }
            listM66560c = C27024b.m66560c(arrayList);
        }
        fiatCapitualWithdrawSelectBankDialogView$adapter$2$1.replaceData(listM66560c);
        return Unit.INSTANCE;
    }
}
