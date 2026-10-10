package com.kubi.user.protocol.helper;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.kubi.host.HostManager;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.user.R$color;
import com.kubi.user.protocol.entity.SignProtocolContentItem;
import com.kubi.user.protocol.entity.SignProtocolLinkItem;
import com.kubi.user.protocol.entity.SignProtocolResult;
import com.kubi.user.protocol.link.SignProtocolLinkDialog;
import com.kubi.user.protocol.link.SignProtocolLinkRetainDialog;
import com.kubi.user.protocol.text.SignProtocolContentDialog;
import com.kubi.user.protocol.text.SignProtocolContentRetainDialog;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27018c0;
import f00.C37304a;
import g00.InterfaceC37766r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41686h;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: ShowSignProtocolDialogHelper.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u000eJ*\u0010\u000f\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011H\u0082@¢\u0006\u0002\u0010\u0015J0\u0010\u0016\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\fH\u0082@¢\u0006\u0002\u0010\u001aJ(\u0010\u001b\u001a\u00020\u001c*\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u00172\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006!"}, m90084d2 = {"Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper;", "", "<init>", "()V", "TAG", "", "MAX_PROTOCOL_COUNT", "", "baseSupportUrl", "getBaseSupportUrl", "()Ljava/lang/String;", "showSignProtocolDialogs", "", "signTermListJson", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showSignProtocolLinkDialogList", "protocolLinkItemList", "", "Lcom/kubi/user/protocol/entity/SignProtocolLinkItem;", "protocolContentItemList", "Lcom/kubi/user/protocol/entity/SignProtocolContentItem;", "(Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showSignProtocolContentDialogList", "", "activeIndex", "isFromFirstStep", "(Ljava/util/List;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "configLinkProtocolContent", "", "Lcom/kubi/resources/widget/BaseTextView;", "linkProtocolList", "linkListName", "protocolLinkDialogPageId", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nShowSignProtocolDialogHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShowSignProtocolDialogHelper.kt\ncom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,157:1\n1563#2:158\n1634#2,3:159\n37#3:162\n36#3,3:163\n37#3:166\n36#3,3:167\n*S KotlinDebug\n*F\n+ 1 ShowSignProtocolDialogHelper.kt\ncom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper\n*L\n124#1:158\n124#1:159,3\n124#1:162\n124#1:163,3\n155#1:166\n155#1:167,3\n*E\n"})
public final class ShowSignProtocolDialogHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ShowSignProtocolDialogHelper f53727a = new ShowSignProtocolDialogHelper();

    /* JADX INFO: renamed from: com.kubi.user.protocol.helper.ShowSignProtocolDialogHelper$b */
    /* JADX INFO: compiled from: ShowSignProtocolDialogHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$configLinkProtocolContent$1", "Lcom/kubi/utils/MyClickSpan;", "updateDrawState", "", "ds", "Landroid/text/TextPaint;", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26754b extends C27018c0 {
        @Override // com.kubi.utils.C27018c0, android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            ds2.setUnderlineText(false);
        }

        public C26754b(int i11, ViewOnClickListenerC26755c viewOnClickListenerC26755c) {
            super(i11, viewOnClickListenerC26755c);
        }
    }

    /* JADX INFO: renamed from: com.kubi.user.protocol.helper.ShowSignProtocolDialogHelper$c */
    /* JADX INFO: compiled from: ShowSignProtocolDialogHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$configLinkProtocolContent$2", "Landroid/view/View$OnClickListener;", "onClick", "", "v", "Landroid/view/View;", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class ViewOnClickListenerC26755c implements View.OnClickListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SignProtocolLinkItem f53728b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f53729c;

        public ViewOnClickListenerC26755c(SignProtocolLinkItem signProtocolLinkItem, String str) {
            this.f53728b = signProtocolLinkItem;
            this.f53729c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) throws JSONException {
            Intrinsics.checkNotNullParameter(v11, "v");
            C37304a c37304a = C37304a.f82764a;
            String strDecode = Uri.decode(ShowSignProtocolDialogHelper.f53727a.m65580e() + '/' + this.f53728b.getTermId() + "?appNeedLang=true");
            Intrinsics.checkNotNullExpressionValue(strDecode, "decode(...)");
            InterfaceC37766r.a.m85190a(c37304a, strDecode, null, null, null, null, null, null, 126, null);
            String str = this.f53729c;
            String blockIdPrefix = this.f53728b.getBlockIdPrefix();
            String str2 = blockIdPrefix == null ? "" : blockIdPrefix;
            JSONObject jSONObject = new JSONObject();
            String termId = this.f53728b.getTermId();
            jSONObject.put("agreement_ids", termId != null ? termId : "");
            Unit unit = Unit.INSTANCE;
            C43852m.m96591c(str, str2, null, jSONObject, 4, null);
        }
    }

    /* JADX INFO: renamed from: com.kubi.user.protocol.helper.ShowSignProtocolDialogHelper$a */
    /* JADX INFO: compiled from: ShowSignProtocolDialogHelper.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C26753a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SignProtocolResult.values().length];
            try {
                iArr[SignProtocolResult.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SignProtocolResult.AGREED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SignProtocolResult.EXIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m65579d(@NotNull BaseTextView baseTextView, @NotNull List<SignProtocolLinkItem> linkProtocolList, @NotNull String linkListName, @NotNull String protocolLinkDialogPageId) {
        Intrinsics.checkNotNullParameter(baseTextView, "<this>");
        Intrinsics.checkNotNullParameter(linkProtocolList, "linkProtocolList");
        Intrinsics.checkNotNullParameter(linkListName, "linkListName");
        Intrinsics.checkNotNullParameter(protocolLinkDialogPageId, "protocolLinkDialogPageId");
        int iCoerceIn = RangesKt.coerceIn(linkProtocolList.size(), 1, 4);
        int identifier = baseTextView.getContext().getResources().getIdentifier(linkListName + iCoerceIn, TypedValues.Custom.S_STRING, baseTextView.getContext().getPackageName());
        List listTake = CollectionsKt.take(linkProtocolList, iCoerceIn);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
        Iterator it = listTake.iterator();
        while (it.hasNext()) {
            String protocolName = ((SignProtocolLinkItem) it.next()).getProtocolName();
            if (protocolName == null) {
                protocolName = "";
            }
            arrayList.add(protocolName);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        baseTextView.setText(baseTextView.getContext().getString(identifier, Arrays.copyOf(strArr, strArr.length)));
        HighlightTextHelper.TextTagEnum[] textTagEnumArr = {HighlightTextHelper.TextTagEnum.SPAN, HighlightTextHelper.TextTagEnum.SPAN1, HighlightTextHelper.TextTagEnum.SPAN2, HighlightTextHelper.TextTagEnum.SPAN3};
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < iCoerceIn; i11++) {
            SignProtocolLinkItem signProtocolLinkItem = linkProtocolList.get(i11);
            HighlightTextHelper.TextTagEnum textTagEnum = (HighlightTextHelper.TextTagEnum) ArraysKt.getOrNull(textTagEnumArr, i11);
            if (textTagEnum == null) {
                textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
            }
            C27017c c27017c = C27017c.f54310a;
            int i12 = R$color.c_text;
            arrayList2.add(TuplesKt.m90091to(textTagEnum, new ForegroundColorSpan(c27017c.m66512a(i12))));
            arrayList2.add(TuplesKt.m90091to(textTagEnum, new C26754b(i12, new ViewOnClickListenerC26755c(signProtocolLinkItem, protocolLinkDialogPageId))));
        }
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        Pair[] pairArr = (Pair[]) arrayList2.toArray(new Pair[0]);
        highlightTextHelper.m54120f(baseTextView, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }

    /* JADX INFO: renamed from: e */
    public final String m65580e() {
        return HostManager.a.m() + "/support";
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:35:0x00dd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m65581f(List<SignProtocolContentItem> list, int i11, boolean z11, Continuation<? super Boolean> continuation) {
        ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1 showSignProtocolDialogHelper$showSignProtocolContentDialogList$1;
        SignProtocolResult signProtocolResult;
        List<SignProtocolContentItem> list2;
        int i12;
        int i13;
        boolean z12;
        SignProtocolResult signProtocolResult2;
        Object objM65581f;
        if (continuation instanceof ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1) {
            showSignProtocolDialogHelper$showSignProtocolContentDialogList$1 = (ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1) continuation;
            int i14 = showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.label = i14 - Integer.MIN_VALUE;
            } else {
                showSignProtocolDialogHelper$showSignProtocolContentDialogList$1 = new ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1(this, continuation);
            }
        } else {
            showSignProtocolDialogHelper$showSignProtocolContentDialogList$1 = new ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1(this, continuation);
        }
        Object objShow = showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i15 = showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.label;
        boolean z13 = false;
        if (i15 == 0) {
            ResultKt.throwOnFailure(objShow);
            SignProtocolContentDialog.Companion companion = SignProtocolContentDialog.f53741t0;
            showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.L$0 = list;
            showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.I$0 = i11;
            showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.Z$0 = z11;
            showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.label = 1;
            objShow = companion.show(list, i11, z11, showSignProtocolDialogHelper$showSignProtocolContentDialogList$1);
            if (objShow != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i15 == 1) {
            z11 = showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.Z$0;
            i11 = showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.I$0;
            list = (List) showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.L$0;
            ResultKt.throwOnFailure(objShow);
        } else {
            if (i15 != 2) {
                if (i15 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objShow);
                return objShow;
            }
            i12 = showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.I$1;
            z12 = showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.Z$0;
            i13 = showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.I$0;
            signProtocolResult = (SignProtocolResult) showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.L$1;
            list2 = (List) showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.L$0;
            ResultKt.throwOnFailure(objShow);
        }
        signProtocolResult2 = (SignProtocolResult) objShow;
        if (signProtocolResult2 == SignProtocolResult.AGREED) {
            showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.L$0 = SpillingKt.nullOutSpilledVariable(list2);
            showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.L$1 = SpillingKt.nullOutSpilledVariable(signProtocolResult);
            showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.L$2 = SpillingKt.nullOutSpilledVariable(signProtocolResult2);
            showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.I$0 = i13;
            showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.Z$0 = z12;
            showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.I$1 = i12;
            showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.label = 3;
            objM65581f = m65581f(list2, i12, false, showSignProtocolDialogHelper$showSignProtocolContentDialogList$1);
            if (objM65581f != coroutine_suspended) {
                return coroutine_suspended;
            }
            return objM65581f;
        }
        z13 = true;
        return Boxing.boxBoolean(z13);
        Pair pair = (Pair) objShow;
        signProtocolResult = (SignProtocolResult) pair.component1();
        int iIntValue = ((Number) pair.component2()).intValue();
        int i16 = C26753a.$EnumSwitchMapping$0[signProtocolResult.ordinal()];
        if (i16 != 1) {
            if (i16 != 2) {
                if (i16 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                SignProtocolContentRetainDialog.Companion companion2 = SignProtocolContentRetainDialog.f53746t0;
                showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.L$0 = list;
                showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.L$1 = SpillingKt.nullOutSpilledVariable(signProtocolResult);
                showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.I$0 = i11;
                showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.Z$0 = z11;
                showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.I$1 = iIntValue;
                showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.label = 2;
                Object objShow2 = companion2.show(list, iIntValue, showSignProtocolDialogHelper$showSignProtocolContentDialogList$1);
                if (objShow2 != coroutine_suspended) {
                    list2 = list;
                    i12 = iIntValue;
                    objShow = objShow2;
                    boolean z14 = z11;
                    i13 = i11;
                    z12 = z14;
                    signProtocolResult2 = (SignProtocolResult) objShow;
                    if (signProtocolResult2 == SignProtocolResult.AGREED) {
                        showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.L$0 = SpillingKt.nullOutSpilledVariable(list2);
                        showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.L$1 = SpillingKt.nullOutSpilledVariable(signProtocolResult);
                        showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.L$2 = SpillingKt.nullOutSpilledVariable(signProtocolResult2);
                        showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.I$0 = i13;
                        showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.Z$0 = z12;
                        showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.I$1 = i12;
                        showSignProtocolDialogHelper$showSignProtocolContentDialogList$1.label = 3;
                        objM65581f = m65581f(list2, i12, false, showSignProtocolDialogHelper$showSignProtocolContentDialogList$1);
                        if (objM65581f != coroutine_suspended) {
                            return objM65581f;
                        }
                    }
                }
                return coroutine_suspended;
            }
            z13 = true;
        }
        return Boxing.boxBoolean(z13);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m65583h(List<SignProtocolLinkItem> list, List<SignProtocolContentItem> list2, Continuation<? super Boolean> continuation) {
        ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1 showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1;
        List<SignProtocolLinkItem> list3;
        SignProtocolResult signProtocolResult;
        SignProtocolResult signProtocolResult2;
        Object objM65581f;
        if (continuation instanceof ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1) {
            showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1 = (ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1) continuation;
            int i11 = showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1 = new ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1(this, continuation);
            }
        } else {
            showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1 = new ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1(this, continuation);
        }
        Object objShow = showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1.label;
        boolean z11 = false;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objShow);
            SignProtocolLinkDialog.Companion companion = SignProtocolLinkDialog.f53731t0;
            showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1.L$0 = list;
            showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1.L$1 = list2;
            showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1.label = 1;
            objShow = companion.show(list, showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1);
            if (objShow != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    signProtocolResult = (SignProtocolResult) showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1.L$2;
                    list2 = (List) showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1.L$1;
                    list3 = (List) showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1.L$0;
                    ResultKt.throwOnFailure(objShow);
                } else {
                    if (i12 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            ResultKt.throwOnFailure(objShow);
            return objShow;
        }
        list2 = (List) showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1.L$1;
        list = (List) showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1.L$0;
        ResultKt.throwOnFailure(objShow);
        signProtocolResult2 = (SignProtocolResult) objShow;
        if (signProtocolResult2 == SignProtocolResult.AGREED && !list2.isEmpty()) {
            showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1.L$0 = SpillingKt.nullOutSpilledVariable(list3);
            showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1.L$1 = SpillingKt.nullOutSpilledVariable(list2);
            showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1.L$2 = SpillingKt.nullOutSpilledVariable(signProtocolResult);
            showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1.L$3 = SpillingKt.nullOutSpilledVariable(signProtocolResult2);
            showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1.label = 4;
            objM65581f = m65581f(list2, 0, true, showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1);
            if (objM65581f != coroutine_suspended) {
                return coroutine_suspended;
            }
            return objM65581f;
        }
        z11 = true;
        return Boxing.boxBoolean(z11);
        SignProtocolResult signProtocolResult3 = (SignProtocolResult) objShow;
        int i13 = C26753a.$EnumSwitchMapping$0[signProtocolResult3.ordinal()];
        if (i13 != 1) {
            if (i13 == 2) {
                if (!list2.isEmpty()) {
                    showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1.L$0 = SpillingKt.nullOutSpilledVariable(list);
                    showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1.L$1 = SpillingKt.nullOutSpilledVariable(list2);
                    showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1.L$2 = SpillingKt.nullOutSpilledVariable(signProtocolResult3);
                    showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1.label = 2;
                    Object objM65581f2 = m65581f(list2, 0, true, showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1);
                    if (objM65581f2 != coroutine_suspended) {
                        return objM65581f2;
                    }
                }
                z11 = true;
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                SignProtocolLinkRetainDialog.Companion companion2 = SignProtocolLinkRetainDialog.f53736t0;
                showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1.L$0 = SpillingKt.nullOutSpilledVariable(list);
                showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1.L$1 = list2;
                showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1.L$2 = SpillingKt.nullOutSpilledVariable(signProtocolResult3);
                showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1.label = 3;
                Object objShow2 = companion2.show(list, showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1);
                if (objShow2 != coroutine_suspended) {
                    list3 = list;
                    signProtocolResult = signProtocolResult3;
                    objShow = objShow2;
                    signProtocolResult2 = (SignProtocolResult) objShow;
                    if (signProtocolResult2 == SignProtocolResult.AGREED) {
                        showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1.L$0 = SpillingKt.nullOutSpilledVariable(list3);
                        showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1.L$1 = SpillingKt.nullOutSpilledVariable(list2);
                        showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1.L$2 = SpillingKt.nullOutSpilledVariable(signProtocolResult);
                        showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1.L$3 = SpillingKt.nullOutSpilledVariable(signProtocolResult2);
                        showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1.label = 4;
                        objM65581f = m65581f(list2, 0, true, showSignProtocolDialogHelper$showSignProtocolLinkDialogList$1);
                        if (objM65581f != coroutine_suspended) {
                            return objM65581f;
                        }
                    }
                    z11 = true;
                }
            }
            return coroutine_suspended;
        }
        return Boxing.boxBoolean(z11);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final Object m65582g(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        return C41686h.m91049g(C42911a.m94121c(), new ShowSignProtocolDialogHelper$showSignProtocolDialogs$2(str, null), continuation);
    }
}
