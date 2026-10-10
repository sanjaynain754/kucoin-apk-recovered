package com.kubi.quotefacade.tradechance.submodule.gembox;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.kubi.quotefacade.R$color;
import com.kubi.quotefacade.R$mipmap;
import com.kubi.quotefacade.entity.ChanceGemBoxCurrencyHighLight;
import com.kubi.quotefacade.entity.ChanceGemBoxTextItem;
import com.kubi.utils.C27059l;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.sequences.SequencesKt;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.quotefacade.tradechance.submodule.gembox.g, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ChanceGemBoxHelper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010J\f\u0010\u0014\u001a\u00020\u0015*\u00020\u0013H\u0002J\f\u0010\u0016\u001a\u00020\u0015*\u00020\u0013H\u0002J\f\u0010\u0017\u001a\u00020\u0015*\u00020\u0013H\u0002J\u0016\u0010\u0018\u001a\u00020\u0015*\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0002J\u0014\u0010\u0018\u001a\u0004\u0018\u00010\f*\b\u0012\u0004\u0012\u00020\u00130\u0010H\u0002J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0002\u0010\u001bJ\u0014\u0010\u001c\u001a\u00020\u001d*\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\fH\u0002R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/quotefacade/tradechance/submodule/gembox/ChanceGemBoxHelper;", "", "<init>", "()V", "heatToIconList", "", "", "heatValue", "", "heatToIconListForOtherCoins", "GEMBOX_TYPE_LIST", "", "", "[Ljava/lang/String;", "TRADE_TYPE_ARRAY", "convertHighLights", "", "Lcom/kubi/quotefacade/entity/ChanceGemBoxTextItem;", "highLights", "Lcom/kubi/quotefacade/entity/ChanceGemBoxCurrencyHighLight;", "needType", "", "isTrade", "needTradeByParam", "maxTradeType", "getHighLightIcon", "highLight", "(Lcom/kubi/quotefacade/entity/ChanceGemBoxCurrencyHighLight;)Ljava/lang/Integer;", "modifyColor", "", "type", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChanceGemBoxHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChanceGemBoxHelper.kt\ncom/kubi/quotefacade/tradechance/submodule/gembox/ChanceGemBoxHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,232:1\n1869#2,2:233\n1869#2,2:235\n1573#2:237\n1604#2,4:238\n774#2:242\n865#2,2:243\n1999#2,14:245\n158#3,6:259\n170#3,6:265\n*S KotlinDebug\n*F\n+ 1 ChanceGemBoxHelper.kt\ncom/kubi/quotefacade/tradechance/submodule/gembox/ChanceGemBoxHelper\n*L\n36#1:233,2\n79#1:235,2\n144#1:237\n144#1:238,4\n185#1:242\n185#1:243,2\n187#1:245,14\n212#1:259,6\n213#1:265,6\n*E\n"})
public final class ChanceGemBoxHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ChanceGemBoxHelper f42656a = new ChanceGemBoxHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final String[] f42657b = {"SUDDEN_RISE", "SUDDEN_FALL", "NEW_CURRENCY_OPEN", "BREAKING_NEWS", "MARKET_CHANGE", "BIG_MONEY", "PRO_TRADER", "ALL_TRADER"};

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final String[] f42658c = {"BIG_MONEY", "PRO_TRADER", "ALL_TRADER"};

    /* JADX INFO: renamed from: h */
    public static final boolean m53169h(ChanceGemBoxCurrencyHighLight it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return f42656a.m53184v(it);
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m53170i(ChanceGemBoxCurrencyHighLight it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (f42656a.m53179q(it)) {
            return false;
        }
        String title = it.getTitle();
        return title == null || title.length() == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static final boolean m53171j(Ref.ObjectRef objectRef, ChanceGemBoxCurrencyHighLight it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ChanceGemBoxHelper chanceGemBoxHelper = f42656a;
        if (chanceGemBoxHelper.m53179q(it)) {
            return chanceGemBoxHelper.m53183u(it) && chanceGemBoxHelper.m53181s(it, (String) objectRef.element);
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m53172k(ChanceGemBoxCurrencyHighLight it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String type = it.getType();
        return type == null || type.length() == 0;
    }

    /* JADX INFO: renamed from: l */
    public static final ChanceGemBoxCurrencyHighLight m53173l(ChanceGemBoxCurrencyHighLight gemboxCardDataHighLight) {
        Intrinsics.checkNotNullParameter(gemboxCardDataHighLight, "gemboxCardDataHighLight");
        return ChanceGemBoxCurrencyHighLight.copy$default(gemboxCardDataHighLight, null, null, f42656a.m53176n(gemboxCardDataHighLight), null, null, null, 59, null);
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m53174m(ChanceGemBoxCurrencyHighLight it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getIcon() != null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    @NotNull
    /* JADX INFO: renamed from: g */
    public final List<ChanceGemBoxTextItem> m53175g(@NotNull List<ChanceGemBoxCurrencyHighLight> highLights) {
        Intrinsics.checkNotNullParameter(highLights, "highLights");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        List<ChanceGemBoxCurrencyHighLight> list = CollectionsKt.toList(highLights);
        objectRef.element = f42656a.m53180r(list);
        List list2 = SequencesKt.toList(SequencesKt.filter(SequencesKt.map(SequencesKt.filterNot(SequencesKt.filter(SequencesKt.filterNot(SequencesKt.filter(CollectionsKt.asSequence(list), new Function1() { // from class: com.kubi.quotefacade.tradechance.submodule.gembox.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ChanceGemBoxHelper.m53169h((ChanceGemBoxCurrencyHighLight) obj));
            }
        }), new Function1() { // from class: com.kubi.quotefacade.tradechance.submodule.gembox.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ChanceGemBoxHelper.m53170i((ChanceGemBoxCurrencyHighLight) obj));
            }
        }), new Function1() { // from class: com.kubi.quotefacade.tradechance.submodule.gembox.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ChanceGemBoxHelper.m53171j(objectRef, (ChanceGemBoxCurrencyHighLight) obj));
            }
        }), new Function1() { // from class: com.kubi.quotefacade.tradechance.submodule.gembox.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ChanceGemBoxHelper.m53172k((ChanceGemBoxCurrencyHighLight) obj));
            }
        }), new Function1() { // from class: com.kubi.quotefacade.tradechance.submodule.gembox.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChanceGemBoxHelper.m53173l((ChanceGemBoxCurrencyHighLight) obj);
            }
        }), new Function1() { // from class: com.kubi.quotefacade.tradechance.submodule.gembox.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ChanceGemBoxHelper.m53174m((ChanceGemBoxCurrencyHighLight) obj));
            }
        }));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ChanceGemBoxCurrencyHighLight chanceGemBoxCurrencyHighLight = (ChanceGemBoxCurrencyHighLight) obj;
            ChanceGemBoxHelper chanceGemBoxHelper = f42656a;
            ChanceGemBoxTextItem chanceGemBoxTextItem = new ChanceGemBoxTextItem(C27041f.m66668h(chanceGemBoxHelper.m53179q(chanceGemBoxCurrencyHighLight) ? chanceGemBoxCurrencyHighLight.getDescription() : chanceGemBoxCurrencyHighLight.getTitle()), chanceGemBoxCurrencyHighLight.getIcon(), i11);
            String text = chanceGemBoxTextItem.getText();
            String tradeDirection = chanceGemBoxCurrencyHighLight.getTradeDirection();
            if (tradeDirection == null) {
                tradeDirection = "";
            }
            chanceGemBoxTextItem.setMessage(chanceGemBoxHelper.m53182t(text, tradeDirection));
            arrayList.add(chanceGemBoxTextItem);
            i11 = i12;
        }
        if (arrayList.size() == 1) {
            ((ChanceGemBoxTextItem) arrayList.get(0)).setMarqueeType(2);
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final List<Integer> m53177o(float f11) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = new IntRange(0, 9).iterator();
        while (it.hasNext()) {
            float fNextInt = ((IntIterator) it).nextInt() + 1;
            boolean z11 = (f11 / 0.5f) % ((float) 2) == 1.0f;
            int i11 = R$mipmap.ic_gembox_heat_primary;
            int i12 = R$mipmap.ic_gembox_heat_primary_half;
            if (1.0f > fNextInt || fNextInt > 4.5f) {
                if (5.0f <= fNextInt && fNextInt <= 8.5f) {
                    i11 = R$mipmap.ic_gembox_heat_yellow;
                    i12 = R$mipmap.ic_gembox_heat_yellow_half;
                } else if (9.0f <= fNextInt && fNextInt <= 10.0f) {
                    i11 = R$mipmap.ic_gembox_heat_red;
                    i12 = R$mipmap.ic_gembox_heat_red_half;
                }
            }
            float f12 = 0.5f + f11;
            if (f12 == fNextInt) {
                if (z11) {
                    i11 = i12;
                }
            } else if (fNextInt > f12) {
                i11 = R$mipmap.ic_gembox_heat_grey_cover08;
            }
            arrayList.add(Integer.valueOf(i11));
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final List<Integer> m53178p(float f11) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = new IntRange(0, 4).iterator();
        while (it.hasNext()) {
            float fNextInt = ((IntIterator) it).nextInt() + 1;
            boolean z11 = (f11 / 0.5f) % ((float) 2) == 1.0f;
            int i11 = R$mipmap.ic_gembox_heat_grey_cover16;
            int i12 = R$mipmap.ic_gembox_heat_grey_half;
            float f12 = 0.5f + f11;
            if (f12 == fNextInt) {
                if (z11) {
                    i11 = i12;
                }
            } else if (fNextInt > f12) {
                i11 = R$mipmap.ic_gembox_heat_grey_cover08;
            }
            arrayList.add(Integer.valueOf(i11));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m53179q(ChanceGemBoxCurrencyHighLight chanceGemBoxCurrencyHighLight) {
        return ArraysKt.contains(f42658c, chanceGemBoxCurrencyHighLight.getType());
    }

    /* JADX INFO: renamed from: r */
    public final String m53180r(List<ChanceGemBoxCurrencyHighLight> list) {
        Object next;
        String strRemoveSuffix;
        String strRemoveSuffix2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (f42656a.m53183u((ChanceGemBoxCurrencyHighLight) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                String param = ((ChanceGemBoxCurrencyHighLight) next).getParam();
                double dM66647g = C27039d.m66647g((param == null || (strRemoveSuffix2 = StringsKt.removeSuffix(param, (CharSequence) "%")) == null) ? null : C27041f.m66671k(strRemoveSuffix2));
                do {
                    Object next2 = it.next();
                    String param2 = ((ChanceGemBoxCurrencyHighLight) next2).getParam();
                    double dM66647g2 = C27039d.m66647g((param2 == null || (strRemoveSuffix = StringsKt.removeSuffix(param2, (CharSequence) "%")) == null) ? null : C27041f.m66671k(strRemoveSuffix));
                    if (Double.compare(dM66647g, dM66647g2) < 0) {
                        next = next2;
                        dM66647g = dM66647g2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        ChanceGemBoxCurrencyHighLight chanceGemBoxCurrencyHighLight = (ChanceGemBoxCurrencyHighLight) next;
        if (chanceGemBoxCurrencyHighLight != null) {
            return chanceGemBoxCurrencyHighLight.getType();
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public final CharSequence m53182t(CharSequence charSequence, String str) {
        int i11;
        int i12;
        if (StringsKt.contains$default(charSequence, '[', false, 2, (Object) null) && StringsKt.contains$default(charSequence, ']', false, 2, (Object) null)) {
            int length = charSequence.length();
            int i13 = 0;
            while (true) {
                i11 = -1;
                if (i13 >= length) {
                    i13 = -1;
                    break;
                }
                if (charSequence.charAt(i13) == '[') {
                    break;
                }
                i13++;
            }
            int i14 = i13 - 1;
            int length2 = charSequence.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i15 = length2 - 1;
                    if (charSequence.charAt(length2) == ']') {
                        i11 = length2;
                        break;
                    }
                    if (i15 < 0) {
                        break;
                    }
                    length2 = i15;
                }
            }
            int i16 = i11 - 1;
            if (Intrinsics.areEqual(str, "BUY")) {
                i12 = R$color.brandGreen;
            } else if (Intrinsics.areEqual(str, "SELL")) {
                i12 = R$color.brandRed;
            }
            String strReplace = new Regex("\\[").replace(new Regex("]").replace(charSequence, ""), "");
            IntRange intRange = new IntRange(0, strReplace.length());
            int first = intRange.getFirst();
            if (i14 > intRange.getLast() || first > i14) {
                return strReplace;
            }
            int first2 = intRange.getFirst();
            if (i16 > intRange.getLast() || first2 > i16) {
                return strReplace;
            }
            SpannableString spannableString = new SpannableString(new Regex("\\[").replace(new Regex("]").replace(charSequence, ""), ""));
            spannableString.setSpan(new ForegroundColorSpan(C27046k.m66699n(C27059l.f54343a.m66757a(), i12)), i14, i16, 18);
            return spannableString;
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m53184v(ChanceGemBoxCurrencyHighLight chanceGemBoxCurrencyHighLight) {
        return ArraysKt.contains(f42657b, chanceGemBoxCurrencyHighLight.getType());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: n */
    public final Integer m53176n(ChanceGemBoxCurrencyHighLight chanceGemBoxCurrencyHighLight) {
        String type = chanceGemBoxCurrencyHighLight.getType();
        if (type != null) {
            switch (type.hashCode()) {
                case -1198671559:
                    if (type.equals("NEW_CURRENCY_OPEN")) {
                        return Integer.valueOf(R$mipmap.ic_gembox_new_coin);
                    }
                    return null;
                case -924304625:
                    if (type.equals("BREAKING_NEWS")) {
                        return Integer.valueOf(R$mipmap.ic_gembox_message);
                    }
                    return null;
                case 389622796:
                    if (type.equals("ALL_TRADER")) {
                        return Integer.valueOf(R$mipmap.ic_all_trader);
                    }
                    return null;
                case 410517779:
                    if (type.equals("MARKET_CHANGE")) {
                        return Integer.valueOf(R$mipmap.ic_gembox_event);
                    }
                    return null;
                case 415559040:
                    if (type.equals("PRO_TRADER")) {
                        return Integer.valueOf(R$mipmap.ic_pro_trader);
                    }
                    return null;
                case 688483503:
                    if (type.equals("SUDDEN_FALL")) {
                        return Integer.valueOf(R$mipmap.ic_gembox_down);
                    }
                    return null;
                case 688848893:
                    if (type.equals("SUDDEN_RISE")) {
                        return Integer.valueOf(R$mipmap.ic_gembox_up);
                    }
                    return null;
                case 724788353:
                    if (type.equals("BIG_MONEY")) {
                        return Integer.valueOf(R$mipmap.ic_big_money);
                    }
                    return null;
                default:
                    return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m53181s(ChanceGemBoxCurrencyHighLight chanceGemBoxCurrencyHighLight, String str) {
        return Intrinsics.areEqual(chanceGemBoxCurrencyHighLight.getType(), str);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m53183u(ChanceGemBoxCurrencyHighLight chanceGemBoxCurrencyHighLight) {
        if (!m53179q(chanceGemBoxCurrencyHighLight) || chanceGemBoxCurrencyHighLight.getParam() == null || !StringsKt.endsWith$default(chanceGemBoxCurrencyHighLight.getParam(), "%", false, 2, (Object) null) || C27039d.m66647g(C27041f.m66671k(StringsKt.removeSuffix(chanceGemBoxCurrencyHighLight.getParam(), (CharSequence) "%"))) <= 60.0d) {
            return false;
        }
        return true;
    }
}
