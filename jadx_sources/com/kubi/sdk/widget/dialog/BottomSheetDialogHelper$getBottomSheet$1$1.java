package com.kubi.sdk.widget.dialog;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.res.R$id;
import com.kubi.sdk.res.R$mipmap;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper$getBottomSheet$1$1;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.BiConsumer;
import java.util.Iterator;
import java.util.List;
import p419l2.C42032f;
import p778xy.C46338a;
import p778xy.C46340c;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BottomSheetDialogHelper.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/sdk/widget/dialog/BottomSheetDialogHelper$getBottomSheet$1$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$SelectItem;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBottomSheetDialogHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetDialogHelper.kt\ncom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$getBottomSheet$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,748:1\n1#2:749\n*E\n"})
public final class BottomSheetDialogHelper$getBottomSheet$1$1 extends BaseQuickAdapter<BottomSheetDialogHelper.InterfaceC24339a, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ List<BottomSheetDialogHelper.InterfaceC24339a> f48604i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ DialogFragmentHelper f48605j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean f48606k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ BiConsumer<BaseViewHolder, BottomSheetDialogHelper.InterfaceC24339a> f48607l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetDialogHelper$getBottomSheet$1$1(List<? extends BottomSheetDialogHelper.InterfaceC24339a> list, DialogFragmentHelper dialogFragmentHelper, boolean z11, BiConsumer<BaseViewHolder, BottomSheetDialogHelper.InterfaceC24339a> biConsumer, int i11) {
        super(i11, list);
        this.f48604i = list;
        this.f48605j = dialogFragmentHelper;
        this.f48606k = z11;
        this.f48607l = biConsumer;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0199  */
    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void convert(final BaseViewHolder helper, final BottomSheetDialogHelper.InterfaceC24339a item) {
        float fM66565c;
        int iM6238c;
        float fM66565c2;
        float fMeasureText;
        float fM66565c3;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        Context contextRequireContext = this.f48605j.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        TextView textView = (TextView) helper.getView(R$id.text);
        ImageView imageView = (ImageView) helper.getView(R$id.iv_icon);
        TextView textView2 = (TextView) helper.getView(R$id.tv_icon);
        ImageView imageView2 = (ImageView) helper.getView(R$id.iv_original_icon);
        ImageView imageView3 = (ImageView) helper.getView(R$id.image);
        FrameLayout frameLayout = (FrameLayout) helper.getView(R$id.fl_container);
        TextView textView3 = (TextView) helper.getView(R$id.text_right);
        String rightText = item.getRightText();
        if (rightText == null || rightText.length() == 0) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            textView3.setText(item.getRightText());
        }
        helper.getView(R$id.view_item).setSelected(item.getIsChecked());
        imageView3.setVisibility(item.getIsChecked() ? 0 : 8);
        textView.setText(item.getLabel());
        Integer textColor = item.getTextColor();
        if (textColor != null) {
            textView.setTextColor(textColor.intValue());
        }
        Integer resourceId = item.getResourceId();
        if ((resourceId != null ? resourceId.intValue() : 0) != 0) {
            Intrinsics.checkNotNull(frameLayout);
            C27046k.m66685H(frameLayout);
            Intrinsics.checkNotNull(imageView);
            C27046k.m66685H(imageView);
            Integer resourceId2 = item.getResourceId();
            Intrinsics.checkNotNull(resourceId2);
            imageView.setImageResource(resourceId2.intValue());
        } else if (item.getResourceUrl() != null) {
            Intrinsics.checkNotNull(frameLayout);
            C27046k.m66685H(frameLayout);
            C46340c<Drawable> c46340cMo6634v = C46338a.m102151a(contextRequireContext).mo6634v(item.getResourceUrl());
            C42032f c42032fMo92188b0 = new C42032f().mo92188b0(R$mipmap.kucoin_icon_default_icon);
            C42032f c42032f = c42032fMo92188b0;
            if (this.f48606k) {
                Intrinsics.checkNotNull(imageView);
                C27046k.m66685H(imageView);
                c42032f.mo6606a(C42032f.m92236t0());
            } else {
                Intrinsics.checkNotNull(imageView2);
                C27046k.m66685H(imageView2);
            }
            Intrinsics.checkNotNull(c46340cMo6634v.mo6606a(c42032fMo92188b0).m6594E0(this.f48606k ? imageView : imageView2));
        } else if (item.getResourceText() != null) {
            Intrinsics.checkNotNull(frameLayout);
            C27046k.m66685H(frameLayout);
            Intrinsics.checkNotNull(textView2);
            C27046k.m66685H(textView2);
            textView2.setText(item.getResourceText());
        } else if (item.getResourceView() != null) {
            Intrinsics.checkNotNull(frameLayout);
            C27046k.m66685H(frameLayout);
            Intrinsics.checkNotNull(imageView);
            C27046k.m66700o(imageView);
            View resourceView = item.getResourceView();
            if ((resourceView != null ? resourceView.getParent() : null) != null) {
                View resourceView2 = item.getResourceView();
                ViewGroup viewGroup = (ViewGroup) (resourceView2 != null ? resourceView2.getParent() : null);
                if (viewGroup != null) {
                    viewGroup.removeView(item.getResourceView());
                }
            }
            frameLayout.addView(item.getResourceView(), new FrameLayout.LayoutParams(-1, -1));
        } else {
            Intrinsics.checkNotNull(frameLayout);
            C27046k.m66700o(frameLayout);
        }
        Intrinsics.checkNotNull(imageView);
        if (ViewExtKt.m66581l(imageView)) {
            fM66565c = C27025c.m66565c(contextRequireContext, 10);
        } else {
            Intrinsics.checkNotNull(imageView2);
            if (ViewExtKt.m66581l(imageView2)) {
                fM66565c = C27025c.m66565c(contextRequireContext, 10);
            } else {
                Intrinsics.checkNotNull(textView2);
                if (ViewExtKt.m66581l(textView2)) {
                    fM66565c = C27025c.m66565c(contextRequireContext, 10);
                } else {
                    fM66565c = C27025c.m66565c(contextRequireContext, 0);
                }
            }
        }
        textView.setPaddingRelative((int) fM66565c, textView.getPaddingTop(), 0, textView.getPaddingBottom());
        if (C27046k.m66704s(frameLayout)) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat.LayoutParams");
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) layoutParams;
            iM6238c = C5275i0.m6238c(frameLayout) + layoutParams2.getMarginStart() + layoutParams2.getMarginEnd();
        } else {
            iM6238c = 0;
        }
        int paddingStart = iM6238c + textView.getPaddingStart();
        Intrinsics.checkNotNull(imageView3);
        if (!ViewExtKt.m66581l(imageView3)) {
            Intrinsics.checkNotNull(textView3);
            if (ViewExtKt.m66581l(textView3)) {
                String rightText2 = item.getRightText();
                if (!(rightText2 == null || rightText2.length() == 0)) {
                    fMeasureText = textView3.getPaint().measureText(item.getRightText());
                    fM66565c3 = C27025c.m66565c(contextRequireContext, 10);
                }
                textView.setMaxWidth((C5267e0.m6183e() - paddingStart) - ((int) fM66565c2));
                View itemView = helper.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                final DialogFragmentHelper dialogFragmentHelper = this.f48605j;
                final List<BottomSheetDialogHelper.InterfaceC24339a> list = this.f48604i;
                final BiConsumer<BaseViewHolder, BottomSheetDialogHelper.InterfaceC24339a> biConsumer = this.f48607l;
                C27046k.m66711z(itemView, 0L, new Function0() { // from class: j10.z
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BottomSheetDialogHelper$getBottomSheet$1$1.m59023j(item, dialogFragmentHelper, list, biConsumer, helper);
                    }
                }, 1, null);
            }
            fM66565c2 = C27025c.m66565c(contextRequireContext, 20);
            textView.setMaxWidth((C5267e0.m6183e() - paddingStart) - ((int) fM66565c2));
            View itemView2 = helper.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            final DialogFragmentHelper dialogFragmentHelper2 = this.f48605j;
            final List list2 = this.f48604i;
            final BiConsumer biConsumer2 = this.f48607l;
            C27046k.m66711z(itemView2, 0L, new Function0() { // from class: j10.z
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BottomSheetDialogHelper$getBottomSheet$1$1.m59023j(item, dialogFragmentHelper2, list2, biConsumer2, helper);
                }
            }, 1, null);
        }
        ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams3, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat.LayoutParams");
        LinearLayoutCompat.LayoutParams layoutParams4 = (LinearLayoutCompat.LayoutParams) layoutParams3;
        fMeasureText = C5275i0.m6238c(imageView3) + layoutParams4.getMarginStart() + layoutParams4.getMarginEnd();
        fM66565c3 = C27025c.m66565c(contextRequireContext, 10);
        fM66565c2 = fMeasureText + fM66565c3;
        textView.setMaxWidth((C5267e0.m6183e() - paddingStart) - ((int) fM66565c2));
        View itemView3 = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
        final DialogFragmentHelper dialogFragmentHelper3 = this.f48605j;
        final List list3 = this.f48604i;
        final BiConsumer biConsumer3 = this.f48607l;
        C27046k.m66711z(itemView3, 0L, new Function0() { // from class: j10.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BottomSheetDialogHelper$getBottomSheet$1$1.m59023j(item, dialogFragmentHelper3, list3, biConsumer3, helper);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m59023j(final BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a, DialogFragmentHelper dialogFragmentHelper, List list, final BiConsumer biConsumer, final BaseViewHolder baseViewHolder) {
        if (!interfaceC24339a.getClickEnabled()) {
            return Unit.INSTANCE;
        }
        if (interfaceC24339a.getIsChecked()) {
            dialogFragmentHelper.dismiss();
            return Unit.INSTANCE;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((BottomSheetDialogHelper.InterfaceC24339a) it.next()).setChecked(false);
        }
        interfaceC24339a.setChecked(true);
        dialogFragmentHelper.dismiss();
        C27100x0.m66923d(new Function0() { // from class: j10.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BottomSheetDialogHelper$getBottomSheet$1$1.m59024k(biConsumer, baseViewHolder, interfaceC24339a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m59024k(BiConsumer biConsumer, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) throws Exception {
        biConsumer.accept(baseViewHolder, interfaceC24339a);
        return Unit.INSTANCE;
    }
}
