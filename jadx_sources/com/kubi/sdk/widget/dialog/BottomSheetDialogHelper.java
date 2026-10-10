package com.kubi.sdk.widget.dialog;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5275i0;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.kubi.resources.MenuItem;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.resources.widget.KcCoordinatorLayout;
import com.kubi.resources.widget.round.widget.RoundImageView;
import com.kubi.sdk.res.R$id;
import com.kubi.sdk.res.R$layout;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import k00.C40841e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: BottomSheetDialogHelper.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u00012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JZ\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n2\b\b\u0002\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\rJ\u0014\u0010\u0014\u001a\u00020\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007J@\u0010\u0017\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0019\u001a\u00020\r2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b\u0018\u00010\nJ<\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n2\b\b\u0002\u0010\u001b\u001a\u00020\rH\u0007J\"\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u001d\u001a\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J(\u0010\u001f\u001a\u00020\u00052\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\nJU\u0010!\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020\u00122%\b\u0002\u0010&\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u0010\u0018\u00010'J>\u0010+\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fJH\u0010-\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\b\b\u0002\u0010.\u001a\u00020\rJD\u0010/\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\b2\u0006\u00101\u001a\u00020\u00052\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¨\u00063"}, m90084d2 = {"Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper;", "", "<init>", "()V", "getBottomSheet", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "datas", "", "Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$SelectItem;", "callBack", "Lio/reactivex/functions/BiConsumer;", "Lio/chad/library/adapter/base/BaseViewHolder;", "isCircleCrop", "", "close", "Lkotlin/Function0;", "", "title", "", "isCloseButtonShow", "getBottomSheetMenuList", "list", "Lcom/kubi/resources/MenuItem;", "getBottomSheetList", "titleText", "showDivider", "getFullSearchViewDialog", "showImage", FirebaseAnalytics.Event.SEARCH, "keyword", "data", "getSearchDialog", "dataList", "getTipsShowDialog", "topImageRes", "", "content", "actionBtnText", "onActionButtonClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "helper", "getBottomSheetListStyle1", "cancel", "getBottomSheetListStyle2", "showCancel", "getBottomSheetListStyle2Convert", "item", "dialogFragmentHelper", "SelectItem", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBottomSheetDialogHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetDialogHelper.kt\ncom/kubi/sdk/widget/dialog/BottomSheetDialogHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,748:1\n774#2:749\n865#2,2:750\n1563#2:752\n1634#2,3:753\n49#3:756\n65#3,16:757\n93#3,3:773\n*S KotlinDebug\n*F\n+ 1 BottomSheetDialogHelper.kt\ncom/kubi/sdk/widget/dialog/BottomSheetDialogHelper\n*L\n377#1:749\n377#1:750,2\n380#1:752\n380#1:753,3\n431#1:756\n431#1:757,16\n431#1:773,3\n*E\n"})
public final class BottomSheetDialogHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final BottomSheetDialogHelper f48599a = new BottomSheetDialogHelper();

    /* JADX INFO: renamed from: com.kubi.sdk.widget.dialog.BottomSheetDialogHelper$a */
    /* JADX INFO: compiled from: BottomSheetDialogHelper.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0005R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u0005\"\u0004\b \u0010!R\u0018\u0010\"\u001a\u00020#X¦\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0018\u0010(\u001a\u00020#X¦\u000e¢\u0006\f\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006*À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$SelectItem;", "", "id", "", "getId", "()Ljava/lang/String;", Constants.ScionAnalytics.PARAM_LABEL, "", "getLabel", "()Ljava/lang/CharSequence;", "subLabel", "getSubLabel", "value", "getValue", "resourceId", "", "getResourceId", "()Ljava/lang/Integer;", "resourceUrl", "getResourceUrl", "resourceText", "getResourceText", "resourceView", "Landroid/view/View;", "getResourceView", "()Landroid/view/View;", "textColor", "getTextColor", "setTextColor", "(Ljava/lang/Integer;)V", "rightText", "getRightText", "setRightText", "(Ljava/lang/String;)V", "clickEnabled", "", "getClickEnabled", "()Z", "setClickEnabled", "(Z)V", "isChecked", "setChecked", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC24339a {
        @Nullable
        /* JADX INFO: renamed from: a */
        Integer getResourceId();

        @Nullable
        /* JADX INFO: renamed from: b */
        Integer getTextColor();

        @Nullable
        /* JADX INFO: renamed from: c */
        String getRightText();

        @Nullable
        /* JADX INFO: renamed from: d */
        String getSubLabel();

        /* JADX INFO: renamed from: e */
        void mo59014e(boolean z11);

        @Nullable
        /* JADX INFO: renamed from: f */
        String getResourceUrl();

        /* JADX INFO: renamed from: g */
        boolean getClickEnabled();

        @NotNull
        String getId();

        @NotNull
        CharSequence getLabel();

        @NotNull
        String getValue();

        /* JADX INFO: renamed from: h */
        void mo59017h(@Nullable String str);

        /* JADX INFO: renamed from: i */
        void mo59018i(@Nullable Integer num);

        /* JADX INFO: renamed from: isChecked */
        boolean getIsChecked();

        @Nullable
        /* JADX INFO: renamed from: j */
        String getResourceText();

        @Nullable
        /* JADX INFO: renamed from: k */
        View getResourceView();

        void setChecked(boolean z11);
    }

    /* JADX INFO: renamed from: com.kubi.sdk.widget.dialog.BottomSheetDialogHelper$b */
    /* JADX INFO: compiled from: TextView.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release", "androidx/core/widget/TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 BottomSheetDialogHelper.kt\ncom/kubi/sdk/widget/dialog/BottomSheetDialogHelper\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,97:1\n78#2:98\n71#3:99\n432#4,7:100\n439#4,2:109\n441#4:134\n443#4,11:136\n774#5:107\n865#5:108\n866#5:135\n106#6:111\n78#6,22:112\n*S KotlinDebug\n*F\n+ 1 BottomSheetDialogHelper.kt\ncom/kubi/sdk/widget/dialog/BottomSheetDialogHelper\n*L\n438#1:107\n438#1:108\n438#1:135\n440#1:111\n440#1:112,22\n*E\n"})
    public static final class C24340b implements TextWatcher {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BottomSheetDialogHelper$getSearchDialog$1$adapter$1 f48600b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ LinearLayout f48601c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ RecyclerView f48602d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ List f48603e;

        public C24340b(BottomSheetDialogHelper$getSearchDialog$1$adapter$1 bottomSheetDialogHelper$getSearchDialog$1$adapter$1, LinearLayout linearLayout, RecyclerView recyclerView, List list) {
            this.f48600b = bottomSheetDialogHelper$getSearchDialog$1$adapter$1;
            this.f48601c = linearLayout;
            this.f48602d = recyclerView;
            this.f48603e = list;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            List arrayList;
            BottomSheetDialogHelper$getSearchDialog$1$adapter$1 bottomSheetDialogHelper$getSearchDialog$1$adapter$1 = this.f48600b;
            if (text == null || text.length() == 0) {
                Intrinsics.checkNotNull(this.f48601c);
                ViewExtKt.m66577h(this.f48601c);
                Intrinsics.checkNotNull(this.f48602d);
                ViewExtKt.m66594y(this.f48602d);
                arrayList = this.f48603e;
            } else {
                List list = this.f48603e;
                arrayList = new ArrayList();
                for (Object obj : list) {
                    String string = ((InterfaceC24339a) obj).getLabel().toString();
                    Locale ENGLISH = Locale.ENGLISH;
                    Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                    String upperCase = string.toUpperCase(ENGLISH);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    String string2 = text.toString();
                    int length = string2.length() - 1;
                    int i11 = 0;
                    boolean z11 = false;
                    while (i11 <= length) {
                        boolean z12 = Intrinsics.compare((int) string2.charAt(!z11 ? i11 : length), 32) <= 0;
                        if (z11) {
                            if (!z12) {
                                break;
                            } else {
                                length--;
                            }
                        } else if (z12) {
                            i11++;
                        } else {
                            z11 = true;
                        }
                    }
                    String string3 = string2.subSequence(i11, length + 1).toString();
                    Locale ENGLISH2 = Locale.ENGLISH;
                    Intrinsics.checkNotNullExpressionValue(ENGLISH2, "ENGLISH");
                    String upperCase2 = string3.toUpperCase(ENGLISH2);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                    if (StringsKt.contains$default((CharSequence) upperCase, (CharSequence) C27041f.m66668h(upperCase2), false, 2, (Object) null)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    Intrinsics.checkNotNull(this.f48601c);
                    ViewExtKt.m66594y(this.f48601c);
                    Intrinsics.checkNotNull(this.f48602d);
                    ViewExtKt.m66577h(this.f48602d);
                } else {
                    Intrinsics.checkNotNull(this.f48601c);
                    ViewExtKt.m66577h(this.f48601c);
                    Intrinsics.checkNotNull(this.f48602d);
                    ViewExtKt.m66594y(this.f48602d);
                }
            }
            bottomSheetDialogHelper$getSearchDialog$1$adapter$1.replaceData(arrayList);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
        }
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m58945C(boolean z11, String str, List list, boolean z12, BiConsumer biConsumer, final Function0 function0, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        RecyclerView recyclerView = (RecyclerView) viewHolder.getView(R$id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(viewHolder.itemView.getContext()));
        recyclerView.setAdapter(new BottomSheetDialogHelper$getBottomSheet$1$1(list, dialogFragmentHelper, z12, biConsumer, R$layout.kucoin_item_simple_text));
        if (z11) {
            View view = viewHolder.getView(R$id.tv_cancel);
            Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
            C27046k.m66711z(view, 0L, new Function0() { // from class: j10.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BottomSheetDialogHelper.m58946D(function0, dialogFragmentHelper);
                }
            }, 1, null);
        } else {
            View view2 = viewHolder.getView(R$id.tv_cancel);
            Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
            ViewExtKt.m66577h(view2);
        }
        if (str != null && str.length() != 0) {
            TextView textView = (TextView) viewHolder.getView(R$id.tv_title);
            Intrinsics.checkNotNull(textView);
            ViewExtKt.m66594y(textView);
            textView.setText(str);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ DialogFragmentHelper m58980j0(BottomSheetDialogHelper bottomSheetDialogHelper, String str, int i11, String str2, String str3, Function1 function1, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = "";
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            str2 = "";
        }
        if ((i12 & 8) != 0) {
            str3 = "";
        }
        if ((i12 & 16) != 0) {
            function1 = null;
        }
        return bottomSheetDialogHelper.m59008i0(str, i11, str2, str3, function1);
    }

    /* JADX INFO: renamed from: k0 */
    public static final Unit m58982k0(String str, int i11, String str2, String str3, final Function1 function1, BaseViewHolder viewHolder, final DialogFragmentHelper helper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(helper, "helper");
        TextView textView = (TextView) viewHolder.getView(R$id.tvTitle);
        if (textView != null) {
            if (str.length() > 0) {
                C27046k.m66685H(textView);
            } else {
                C27046k.m66700o(textView);
            }
            textView.setText(str);
        }
        RoundImageView roundImageView = (RoundImageView) viewHolder.getView(R$id.rivTopImage);
        if (roundImageView != null) {
            if (i11 == 0) {
                C27046k.m66700o(roundImageView);
            } else {
                C27046k.m66685H(roundImageView);
            }
            roundImageView.setImageResource(i11);
        }
        TextView textView2 = (TextView) viewHolder.getView(R$id.tvContent);
        if (textView2 != null) {
            textView2.setMovementMethod(ScrollingMovementMethod.getInstance());
            if (str2.length() > 0) {
                C27046k.m66685H(textView2);
            } else {
                C27046k.m66700o(textView2);
            }
            textView2.setText(str2);
        }
        TextView textView3 = (TextView) viewHolder.getView(R$id.tvBtnOk);
        if (textView3 != null) {
            if (str3.length() > 0) {
                C27046k.m66685H(textView3);
            } else {
                C27046k.m66700o(textView3);
            }
            textView3.setText(str3);
            C27046k.m66711z(textView3, 0L, new Function0() { // from class: j10.u
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BottomSheetDialogHelper.m58984l0(function1, helper);
                }
            }, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public static /* synthetic */ DialogFragmentHelper m58944B(BottomSheetDialogHelper bottomSheetDialogHelper, List list, BiConsumer biConsumer, boolean z11, Function0 function0, String str, boolean z12, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            function0 = null;
        }
        if ((i11 & 16) != 0) {
            str = null;
        }
        if ((i11 & 32) != 0) {
            z12 = true;
        }
        return bottomSheetDialogHelper.m59000A(list, biConsumer, z11, function0, str, z12);
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m58946D(Function0 function0, DialogFragmentHelper dialogFragmentHelper) {
        if (function0 != null) {
            function0.invoke();
        }
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public static final Unit m58947E(BaseViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        RecyclerView recyclerView = (RecyclerView) viewHolder.getView(R$id.recycler_view);
        if (C5275i0.m6237b(recyclerView) > C5267e0.m6182d() / 2) {
            recyclerView.getLayoutParams().height = C5267e0.m6182d() / 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public static /* synthetic */ DialogFragmentHelper m58948G(BottomSheetDialogHelper bottomSheetDialogHelper, List list, String str, boolean z11, BiConsumer biConsumer, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            biConsumer = null;
        }
        return bottomSheetDialogHelper.m59001F(list, str, z11, biConsumer);
    }

    /* JADX INFO: renamed from: H */
    public static final Unit m58949H(String str, boolean z11, List list, BiConsumer biConsumer, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        ((TextView) viewHolder.getView(R$id.tv_title)).setText(str);
        viewHolder.setVisible(R$id.view_divider, z11);
        RecyclerView recyclerView = (RecyclerView) viewHolder.getView(R$id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(viewHolder.itemView.getContext()));
        recyclerView.setAdapter(new BottomSheetDialogHelper$getBottomSheetList$1$1(list, biConsumer, dialogFragmentHelper, R$layout.kucoin_item_text));
        View view = viewHolder.getView(R$id.iv_cancel);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: j10.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BottomSheetDialogHelper.m58950I(dialogFragmentHelper);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J */
    public static final Unit m58951J(BaseViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        RecyclerView recyclerView = (RecyclerView) viewHolder.getView(R$id.recycler_view);
        int iM6237b = C5275i0.m6237b(recyclerView);
        if (iM6237b > ((int) (((double) C5267e0.m6182d()) / 1.8d))) {
            recyclerView.getLayoutParams().height = (int) (((double) C5267e0.m6182d()) / 1.8d);
        } else if (iM6237b < ((int) (((double) C5267e0.m6182d()) / 4.1d))) {
            recyclerView.getLayoutParams().height = (int) (((double) C5267e0.m6182d()) / 4.1d);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L */
    public static final Unit m58952L(List list, BiConsumer biConsumer, final Function0 function0, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        RecyclerView recyclerView = (RecyclerView) viewHolder.getView(R$id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(viewHolder.itemView.getContext()));
        recyclerView.setAdapter(new BottomSheetDialogHelper$getBottomSheetListStyle1$1$1(list, biConsumer, dialogFragmentHelper, R$layout.view_bottom_sheet_style_one_item));
        View view = viewHolder.getView(R$id.tv_cancel);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: j10.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BottomSheetDialogHelper.m58953M(function0, dialogFragmentHelper);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M */
    public static final Unit m58953M(Function0 function0, DialogFragmentHelper dialogFragmentHelper) {
        if (function0 != null) {
            function0.invoke();
        }
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N */
    public static final Unit m58954N(BaseViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        RecyclerView recyclerView = (RecyclerView) viewHolder.getView(R$id.recycler_view);
        if (C5275i0.m6237b(recyclerView) > ((int) (((double) C5267e0.m6182d()) * 0.5d))) {
            recyclerView.getLayoutParams().height = (int) (((double) C5267e0.m6182d()) * 0.5d);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public static /* synthetic */ DialogFragmentHelper m58955P(BottomSheetDialogHelper bottomSheetDialogHelper, List list, BiConsumer biConsumer, Function0 function0, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            biConsumer = null;
        }
        if ((i11 & 4) != 0) {
            function0 = null;
        }
        if ((i11 & 8) != 0) {
            z11 = true;
        }
        return bottomSheetDialogHelper.m59003O(list, biConsumer, function0, z11);
    }

    /* JADX INFO: renamed from: Q */
    public static final Unit m58956Q(final List list, final BiConsumer biConsumer, boolean z11, final Function0 function0, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        RecyclerView recyclerView = (RecyclerView) viewHolder.getView(R$id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(viewHolder.itemView.getContext()));
        final int i11 = R$layout.view_bottom_sheet_style_one_horizontal_item;
        recyclerView.setAdapter(new BaseQuickAdapter<InterfaceC24339a, BaseViewHolder>(list, dialogFragmentHelper, biConsumer, i11) { // from class: com.kubi.sdk.widget.dialog.BottomSheetDialogHelper$getBottomSheetListStyle2$1$1

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ List<BottomSheetDialogHelper.InterfaceC24339a> f48614i;

            /* JADX INFO: renamed from: j */
            public final /* synthetic */ DialogFragmentHelper f48615j;

            /* JADX INFO: renamed from: k */
            public final /* synthetic */ BiConsumer<Integer, BottomSheetDialogHelper.InterfaceC24339a> f48616k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(i11, list);
                this.f48614i = list;
                this.f48615j = dialogFragmentHelper;
                this.f48616k = biConsumer;
            }

            @Override // io.chad.library.adapter.base.BaseQuickAdapter
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public void convert(BaseViewHolder helper, BottomSheetDialogHelper.InterfaceC24339a item) {
                Intrinsics.checkNotNullParameter(helper, "helper");
                Intrinsics.checkNotNullParameter(item, "item");
                BottomSheetDialogHelper.f48599a.m59004T(helper, item, this.f48615j, this.f48616k, this.f48614i);
            }
        });
        View view = viewHolder.getView(R$id.tv_cancel);
        if (z11) {
            Intrinsics.checkNotNull(view);
            C27046k.m66711z(view, 0L, new Function0() { // from class: j10.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BottomSheetDialogHelper.m58957R(function0, dialogFragmentHelper);
                }
            }, 1, null);
        } else {
            Intrinsics.checkNotNull(view);
            ViewExtKt.m66577h(view);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R */
    public static final Unit m58957R(Function0 function0, DialogFragmentHelper dialogFragmentHelper) {
        if (function0 != null) {
            function0.invoke();
        }
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S */
    public static final Unit m58958S(BaseViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        RecyclerView recyclerView = (RecyclerView) viewHolder.getView(R$id.recycler_view);
        if (C5275i0.m6237b(recyclerView) > ((int) (((double) C5267e0.m6182d()) * 0.5d))) {
            recyclerView.getLayoutParams().height = (int) (((double) C5267e0.m6182d()) * 0.5d);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X */
    public static final Unit m58961X(List list, BaseViewHolder viewHolder, DialogFragmentHelper dialog) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        RecyclerView recyclerView = (RecyclerView) viewHolder.getView(R$id.recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 4));
        recyclerView.setAdapter(new BottomSheetDialogHelper$getBottomSheetMenuList$1$1$1(list, dialog, R$layout.item_grid_menu_view));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ DialogFragmentHelper m58962Z(BottomSheetDialogHelper bottomSheetDialogHelper, String str, List list, BiConsumer biConsumer, boolean z11, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        return bottomSheetDialogHelper.m59006Y(str, list, biConsumer, z11);
    }

    /* JADX INFO: renamed from: a0 */
    public static final Unit m58964a0(String str, final List list, boolean z11, BiConsumer biConsumer, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        MaterialToolbar materialToolbar;
        MaterialToolbar materialToolbar2;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        KcCoordinatorLayout kcCoordinatorLayout = (KcCoordinatorLayout) viewHolder.getView(R$id.kc_coordinator_layout);
        C40841e scrollbarBinding = kcCoordinatorLayout.getF43827b();
        if (scrollbarBinding != null && (materialToolbar2 = scrollbarBinding.f90748c) != null) {
            materialToolbar2.setTitle(str);
        }
        C40841e scrollbarBinding2 = kcCoordinatorLayout.getF43827b();
        if (scrollbarBinding2 != null && (materialToolbar = scrollbarBinding2.f90748c) != null) {
            materialToolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: j10.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BottomSheetDialogHelper.m58970d0(dialogFragmentHelper, view);
                }
            });
        }
        ClearEditText clearEditText = (ClearEditText) viewHolder.getView(R$id.etSearch);
        RecyclerView recyclerView = (RecyclerView) viewHolder.getView(R$id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(viewHolder.itemView.getContext()));
        final BottomSheetDialogHelper$getFullSearchViewDialog$1$adapter$1 bottomSheetDialogHelper$getFullSearchViewDialog$1$adapter$1 = new BottomSheetDialogHelper$getFullSearchViewDialog$1$adapter$1(list, z11, dialogFragmentHelper, biConsumer, R$layout.kucoin_item_full_simple_text_new);
        recyclerView.setAdapter(bottomSheetDialogHelper$getFullSearchViewDialog$1$adapter$1);
        Intrinsics.checkNotNull(clearEditText, "null cannot be cast to non-null type android.widget.EditText");
        Observable<CharSequence> observableObserveOn = C0206f.m784d(clearEditText).debounce(300L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: j10.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BottomSheetDialogHelper.m58966b0(bottomSheetDialogHelper$getFullSearchViewDialog$1$adapter$1, list, (CharSequence) obj);
            }
        };
        observableObserveOn.subscribe(new Consumer() { // from class: j10.n
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BottomSheetDialogHelper.m58968c0(function1, obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b0 */
    public static final Unit m58966b0(BottomSheetDialogHelper$getFullSearchViewDialog$1$adapter$1 bottomSheetDialogHelper$getFullSearchViewDialog$1$adapter$1, List list, CharSequence charSequence) {
        bottomSheetDialogHelper$getFullSearchViewDialog$1$adapter$1.setNewData(f48599a.m59009n0(StringsKt.trim((CharSequence) charSequence.toString()).toString(), list));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f0 */
    public static final Unit m58973f0(List list, BiConsumer biConsumer, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        View view = viewHolder.getView(R$id.tv_cancel);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: j10.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BottomSheetDialogHelper.m58975g0(dialogFragmentHelper);
            }
        }, 1, null);
        RecyclerView recyclerView = (RecyclerView) viewHolder.getView(R$id.recycler_view);
        LinearLayout linearLayout = (LinearLayout) viewHolder.getView(R$id.view_empty);
        ClearEditText clearEditText = (ClearEditText) viewHolder.getView(R$id.et_search);
        recyclerView.setLayoutManager(new LinearLayoutManager(viewHolder.itemView.getContext()));
        BottomSheetDialogHelper$getSearchDialog$1$adapter$1 bottomSheetDialogHelper$getSearchDialog$1$adapter$1 = new BottomSheetDialogHelper$getSearchDialog$1$adapter$1(list, dialogFragmentHelper, biConsumer, R$layout.kucoin_item_full_simple_text);
        recyclerView.setAdapter(bottomSheetDialogHelper$getSearchDialog$1$adapter$1);
        if (!list.isEmpty()) {
            List listM66558a = C27024b.m66558a(list);
            Intrinsics.checkNotNull(clearEditText);
            clearEditText.addTextChangedListener(new C24340b(bottomSheetDialogHelper$getSearchDialog$1$adapter$1, linearLayout, recyclerView, listM66558a));
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNull(linearLayout);
        ViewExtKt.m66594y(linearLayout);
        Intrinsics.checkNotNull(recyclerView);
        ViewExtKt.m66577h(recyclerView);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h0 */
    public static final Unit m58977h0(DialogFragmentHelper dialogFragmentHelper, BaseViewHolder it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Dialog dialog = dialogFragmentHelper.getDialog();
        if (dialog != null) {
            int iM6182d = (int) (((double) C5267e0.m6182d()) * 0.8d);
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, iM6182d);
            }
            FrameLayout frameLayout = (FrameLayout) dialog.findViewById(R$id.design_bottom_sheet);
            if (frameLayout != null) {
                BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
                Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
                bottomSheetBehaviorFrom.setPeekHeight(iM6182d);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l0 */
    public static final Unit m58984l0(Function1 function1, DialogFragmentHelper dialogFragmentHelper) {
        if (function1 == null) {
            dialogFragmentHelper.dismiss();
        } else {
            function1.invoke(dialogFragmentHelper);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m0 */
    public static final Unit m58986m0(DialogFragmentHelper dialogFragmentHelper, BaseViewHolder it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Dialog dialog = dialogFragmentHelper.getDialog();
        if (dialog != null) {
            int iM6182d = (int) (((double) C5267e0.m6182d()) * 0.8d);
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, iM6182d);
            }
            FrameLayout frameLayout = (FrameLayout) dialog.findViewById(R$id.design_bottom_sheet);
            if (frameLayout != null) {
                BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
                Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
                bottomSheetBehaviorFrom.setPeekHeight(iM6182d);
            }
        }
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final DialogFragmentHelper m59000A(@NotNull final List<? extends InterfaceC24339a> datas, @NotNull final BiConsumer<BaseViewHolder, InterfaceC24339a> callBack, final boolean z11, @Nullable final Function0<Unit> function0, @Nullable final String str, final boolean z12) {
        Intrinsics.checkNotNullParameter(datas, "datas");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        return DialogFragmentHelper.f43568p0.newInstance(R$layout.view_bottom_sheet_dialog, true).m54237f4(new Function2() { // from class: j10.y
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BottomSheetDialogHelper.m58945C(z12, str, datas, z11, callBack, function0, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        }).m54238g4(new Function1() { // from class: j10.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BottomSheetDialogHelper.m58947E((BaseViewHolder) obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final DialogFragmentHelper m59001F(@NotNull final List<? extends InterfaceC24339a> datas, @Nullable final String str, final boolean z11, @Nullable final BiConsumer<BaseViewHolder, InterfaceC24339a> biConsumer) {
        Intrinsics.checkNotNullParameter(datas, "datas");
        return DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.view_bottom_sheet_list_dialog, 0, 0, 0, false, false, false, false, false, 510, null).m54237f4(new Function2() { // from class: j10.v
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BottomSheetDialogHelper.m58949H(str, z11, datas, biConsumer, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        }).m54238g4(new Function1() { // from class: j10.w
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BottomSheetDialogHelper.m58951J((BaseViewHolder) obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final DialogFragmentHelper m59002K(@NotNull final List<? extends InterfaceC24339a> datas, @Nullable final BiConsumer<Integer, InterfaceC24339a> biConsumer, @Nullable final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(datas, "datas");
        return DialogFragmentHelper.f43568p0.newInstance(R$layout.view_bottom_sheet_style_one, true).m54237f4(new Function2() { // from class: j10.o
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BottomSheetDialogHelper.m58952L(datas, biConsumer, function0, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        }).m54238g4(new Function1() { // from class: j10.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BottomSheetDialogHelper.m58954N((BaseViewHolder) obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final DialogFragmentHelper m59003O(@NotNull final List<? extends InterfaceC24339a> datas, @Nullable final BiConsumer<Integer, InterfaceC24339a> biConsumer, @Nullable final Function0<Unit> function0, final boolean z11) {
        Intrinsics.checkNotNullParameter(datas, "datas");
        return DialogFragmentHelper.f43568p0.newInstance(R$layout.view_bottom_sheet_style_one, true).m54237f4(new Function2() { // from class: j10.c
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BottomSheetDialogHelper.m58956Q(datas, biConsumer, z11, function0, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        }).m54238g4(new Function1() { // from class: j10.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BottomSheetDialogHelper.m58958S((BaseViewHolder) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public final void m59004T(final BaseViewHolder baseViewHolder, final InterfaceC24339a interfaceC24339a, final DialogFragmentHelper dialogFragmentHelper, final BiConsumer<Integer, InterfaceC24339a> biConsumer, final List<? extends InterfaceC24339a> list) {
        TextView textView = (TextView) baseViewHolder.getView(R$id.title);
        TextView textView2 = (TextView) baseViewHolder.getView(R$id.content);
        textView.setText(interfaceC24339a.getLabel());
        if (TextUtils.isEmpty(interfaceC24339a.getSubLabel())) {
            Intrinsics.checkNotNull(textView2);
            ViewExtKt.m66577h(textView2);
        } else {
            textView2.setText(interfaceC24339a.getSubLabel());
            Intrinsics.checkNotNull(textView2);
            ViewExtKt.m66594y(textView2);
        }
        baseViewHolder.setVisible(R$id.image, interfaceC24339a.getIsChecked());
        baseViewHolder.getView(R$id.item_root).setSelected(interfaceC24339a.getIsChecked());
        if (biConsumer != null) {
            View itemView = baseViewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            C27046k.m66711z(itemView, 0L, new Function0() { // from class: j10.r
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BottomSheetDialogHelper.m58959U(interfaceC24339a, dialogFragmentHelper, baseViewHolder, list, biConsumer);
                }
            }, 1, null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final DialogFragmentHelper m59005W(@NotNull final List<MenuItem> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        return DialogFragmentHelper.f43568p0.newInstance(R$layout.dialog_bottom_menu_layout, true).m54237f4(new Function2() { // from class: j10.s
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BottomSheetDialogHelper.m58961X(list, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
    }

    @SuppressLint({"CheckResult"})
    @NotNull
    /* JADX INFO: renamed from: Y */
    public final DialogFragmentHelper m59006Y(@NotNull final String title, @NotNull final List<? extends InterfaceC24339a> datas, @NotNull final BiConsumer<BaseViewHolder, InterfaceC24339a> callBack, final boolean z11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(datas, "datas");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        return DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.view_full_view_dialog, 5, 0, 0, false, false, false, false, false, 508, null).m54237f4(new Function2() { // from class: j10.i
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BottomSheetDialogHelper.m58964a0(title, datas, z11, callBack, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final DialogFragmentHelper m59007e0(@NotNull final List<? extends InterfaceC24339a> dataList, @NotNull final BiConsumer<BaseViewHolder, InterfaceC24339a> callBack) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        final DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.f43568p0.newInstance(R$layout.view_search_view_dialog, true).m54237f4(new Function2() { // from class: j10.e
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BottomSheetDialogHelper.m58973f0(dataList, callBack, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        dialogFragmentHelperM54237f4.m54238g4(new Function1() { // from class: j10.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BottomSheetDialogHelper.m58977h0(dialogFragmentHelperM54237f4, (BaseViewHolder) obj);
            }
        });
        return dialogFragmentHelperM54237f4;
    }

    @NotNull
    /* JADX INFO: renamed from: i0 */
    public final DialogFragmentHelper m59008i0(@NotNull final String title, final int i11, @NotNull final String content, @NotNull final String actionBtnText, @Nullable final Function1<? super DialogFragmentHelper, Unit> function1) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(actionBtnText, "actionBtnText");
        final DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.f43568p0.newInstance(R$layout.dialog_bottom_sheet_tips_alert, true).m54237f4(new Function2() { // from class: j10.a
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BottomSheetDialogHelper.m58982k0(title, i11, content, actionBtnText, function1, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        dialogFragmentHelperM54237f4.m54238g4(new Function1() { // from class: j10.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BottomSheetDialogHelper.m58986m0(dialogFragmentHelperM54237f4, (BaseViewHolder) obj);
            }
        });
        return dialogFragmentHelperM54237f4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: n0 */
    public final List<InterfaceC24339a> m59009n0(@NotNull String keyword, @NotNull List<? extends InterfaceC24339a> data) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        Intrinsics.checkNotNullParameter(data, "data");
        if (keyword.length() == 0) {
            return data;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : data) {
            String string = ((InterfaceC24339a) obj).getLabel().toString();
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String lowerCase = string.toLowerCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String lowerCase2 = keyword.toLowerCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) lowerCase2, false, 2, (Object) null)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((InterfaceC24339a) it.next());
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: I */
    public static final Unit m58950I(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U */
    public static final Unit m58959U(final InterfaceC24339a interfaceC24339a, DialogFragmentHelper dialogFragmentHelper, BaseViewHolder baseViewHolder, List list, final BiConsumer biConsumer) {
        if (!interfaceC24339a.getClickEnabled()) {
            return Unit.INSTANCE;
        }
        if (interfaceC24339a.getIsChecked()) {
            dialogFragmentHelper.dismiss();
            return Unit.INSTANCE;
        }
        final int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition < 0) {
            return Unit.INSTANCE;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC24339a) it.next()).setChecked(false);
        }
        interfaceC24339a.setChecked(true);
        dialogFragmentHelper.dismiss();
        C27100x0.m66923d(new Function0() { // from class: j10.t
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BottomSheetDialogHelper.m58960V(biConsumer, bindingAdapterPosition, interfaceC24339a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V */
    public static final Unit m58960V(BiConsumer biConsumer, int i11, InterfaceC24339a interfaceC24339a) throws Exception {
        biConsumer.accept(Integer.valueOf(i11), interfaceC24339a);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c0 */
    public static final void m58968c0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d0 */
    public static final void m58970d0(DialogFragmentHelper dialogFragmentHelper, View view) {
        dialogFragmentHelper.dismiss();
    }

    /* JADX INFO: renamed from: g0 */
    public static final Unit m58975g0(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }
}
