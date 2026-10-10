package com.kubi.kucoin.home.cards;

import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.kubi.kucoin.home.cards.exception.CardFlowException;
import com.kubi.kucoin.home.cards.group.GroupCardData;
import com.kubi.kucoin.home.cardsconfig.CardListRsp;
import com.kubi.utils.C27099x;
import com.kubi.utils.C27100x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.kucoin.home.cards.f, reason: from Kotlin metadata */
/* JADX INFO: compiled from: CardFlowParser.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H&J\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eJ\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0004J\u000e\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0014\u0010 \u001a\u0004\u0018\u00010\u000f2\b\u0010!\u001a\u0004\u0018\u00010\u0015H\u0002J\u001a\u0010\"\u001a\u0004\u0018\u00010\u000f2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0015H\u0002R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R2\u0010\r\u001a&\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f \u0010*\u0012\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\u00110\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m90084d2 = {"Lcom/kubi/kucoin/home/cards/CardFlowParser;", "", "cardRegistry", "Ljava/util/HashMap;", "", "Lcom/kubi/kucoin/home/cards/ClassMapping;", "<init>", "(Ljava/util/HashMap;)V", "getCardRegistry", "()Ljava/util/HashMap;", "cardsLock", "Ljava/util/concurrent/locks/ReentrantLock;", "reportKey", "addedCard", "", "Lcom/kubi/kucoin/home/cards/BaseCardData;", "kotlin.jvm.PlatformType", "", "configStyle", "", JPushConstants.Analysis.KEY_JSON, "Lcom/google/gson/JsonObject;", "getCardData", "code", "getAddedCardData", "removeCard", "buildVisibleCardFlow", "cardConfig", "Lcom/kubi/kucoin/home/cardsconfig/CardListRsp;", "loadCardData", "configData", "Lcom/kubi/kucoin/home/cardsconfig/CardListRsp$Card;", "buildCard", "card", "createSingleCard", "type", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCardFlowParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardFlowParser.kt\ncom/kubi/kucoin/home/cards/CardFlowParser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CardFlowIssue.kt\ncom/kubi/kucoin/home/cards/exception/CardFlowIssueKt\n*L\n1#1,217:1\n774#2:218\n865#2,2:219\n1869#2,2:226\n774#2:230\n865#2,2:231\n1869#2,2:233\n1#3:221\n44#4,2:222\n44#4,2:224\n44#4,2:228\n44#4,2:235\n*S KotlinDebug\n*F\n+ 1 CardFlowParser.kt\ncom/kubi/kucoin/home/cards/CardFlowParser\n*L\n64#1:218\n64#1:219,2\n174#1:226,2\n92#1:230\n92#1:231,2\n92#1:233,2\n120#1:222,2\n133#1:224,2\n180#1:228,2\n210#1:235,2\n*E\n"})
public abstract class CardFlowParser {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final HashMap<String, ClassMapping> f27887a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ReentrantLock f27888b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public String f27889c;

    /* JADX INFO: renamed from: d */
    public final List<BaseCardData> f27890d;

    /* JADX INFO: renamed from: c */
    public final BaseCardData m32205c(JsonObject jsonObject) {
        Object objM103844constructorimpl;
        String asString;
        List<BaseCardData> children;
        JsonObject asJsonObject;
        if (jsonObject != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                mo29087f(jsonObject);
                JsonElement jsonElement = jsonObject.get("children");
                JsonArray asJsonArray = jsonElement != null ? jsonElement.getAsJsonArray() : null;
                if (asJsonArray != null && asJsonArray.size() != 0) {
                    ArrayList arrayList = new ArrayList();
                    int size = asJsonArray.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        JsonElement jsonElement2 = asJsonArray.get(i11);
                        if (jsonElement2 == null || (asJsonObject = jsonElement2.getAsJsonObject()) == null) {
                            asJsonObject = null;
                        } else {
                            JsonElement jsonElement3 = jsonObject.get("height");
                            if (jsonElement3 != null) {
                                Integer numValueOf = Integer.valueOf(jsonElement3.getAsInt());
                                if (numValueOf.intValue() <= 0) {
                                    numValueOf = null;
                                }
                                if (numValueOf != null) {
                                    asJsonObject.addProperty("height", (Number) (-1));
                                }
                            }
                        }
                        BaseCardData baseCardDataM32205c = m32205c(asJsonObject);
                        if (baseCardDataM32205c != null) {
                            arrayList.add(baseCardDataM32205c);
                        }
                    }
                    GroupCardData groupCardData = (GroupCardData) C27099x.m66913c(jsonObject.toString(), GroupCardData.class);
                    groupCardData.setChildren(arrayList);
                    if (groupCardData.getOrientation() == 0 && (children = groupCardData.getChildren()) != null) {
                        for (BaseCardData baseCardData : children) {
                            if (baseCardData.getWeight() == 0) {
                                baseCardData.setWeight(1);
                            }
                        }
                    }
                    return groupCardData;
                }
                JsonElement jsonElement4 = jsonObject.get("type");
                if (jsonElement4 != null && (asString = jsonElement4.getAsString()) != null) {
                    return m32207g(asString, jsonObject);
                }
                objM103844constructorimpl = Result.m103844constructorimpl(null);
                Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                if (thM103847exceptionOrNullimpl != null) {
                    C44128b.m97263g(this.f27889c, thM103847exceptionOrNullimpl);
                    C43846g.m96568c(new CardFlowException(thM103847exceptionOrNullimpl, this.f27889c, false, null, 8, null), null, 2, null);
                }
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo29087f(@NotNull JsonObject jsonObject);

    @NotNull
    /* JADX INFO: renamed from: j */
    public abstract String mo29088j(@NotNull String str);

    public CardFlowParser(@NotNull HashMap<String, ClassMapping> cardRegistry) {
        Intrinsics.checkNotNullParameter(cardRegistry, "cardRegistry");
        this.f27887a = cardRegistry;
        this.f27888b = new ReentrantLock();
        this.f27889c = "CardFlowParser";
        this.f27890d = Collections.synchronizedList(new ArrayList());
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m32204h(CardFlowParser cardFlowParser, String str, Throwable th2) {
        if (cardFlowParser.f27887a.containsKey(str)) {
            C43840a.m96550d("createSingleCard", "type=" + str);
            C43846g.m96568c(new CardFlowException(th2, cardFlowParser.f27889c, false, null, 8, null), null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public final void m32206d(@NotNull final CardListRsp cardConfig) {
        Intrinsics.checkNotNullParameter(cardConfig, "cardConfig");
        this.f27888b.lock();
        this.f27890d.clear();
        C27100x0.m66924e(new Function0() { // from class: com.kubi.kucoin.home.cards.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardFlowParser.m32203e(cardConfig, this);
            }
        });
        this.f27888b.unlock();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v8, types: [T, com.kubi.kucoin.home.cards.BaseCardData] */
    /* JADX INFO: renamed from: g */
    public final BaseCardData m32207g(final String str, JsonObject jsonObject) {
        Object objM103844constructorimpl;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        try {
            Result.Companion companion = Result.INSTANCE;
            String strM66919i = C27099x.m66919i(jsonObject, false, 2, null);
            ClassMapping classMapping = this.f27887a.get(str);
            Object objM66913c = C27099x.m66913c(strM66919i, classMapping != null ? classMapping.m32217b() : null);
            Intrinsics.checkNotNull(objM66913c, "null cannot be cast to non-null type com.kubi.kucoin.home.cards.BaseCardData");
            ?? r11 = (BaseCardData) objM66913c;
            r11.setWidth(r11.getWidth() == 0 ? -1 : r11.getWidth());
            r11.setHeight(r11.getHeight() == 0 ? -2 : r11.getHeight());
            objectRef.element = r11;
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        final Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97263g(this.f27889c, thM103847exceptionOrNullimpl);
            C27100x0.m66923d(new Function0() { // from class: com.kubi.kucoin.home.cards.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CardFlowParser.m32204h(this.f27884b, str, thM103847exceptionOrNullimpl);
                }
            });
        }
        return (BaseCardData) objectRef.element;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final List<BaseCardData> m32208i() {
        CardInterceptor interceptor;
        if (this.f27888b.isLocked()) {
            return null;
        }
        this.f27888b.lock();
        List<BaseCardData> addedCard = this.f27890d;
        Intrinsics.checkNotNullExpressionValue(addedCard, "addedCard");
        ArrayList arrayList = new ArrayList();
        for (Object obj : addedCard) {
            ClassMapping classMapping = this.f27887a.get(((BaseCardData) obj).getType());
            if ((classMapping == null || (interceptor = classMapping.getInterceptor()) == null) ? true : interceptor.mo29505b()) {
                arrayList.add(obj);
            }
        }
        List<BaseCardData> mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        this.f27888b.unlock();
        return mutableList;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final HashMap<String, ClassMapping> m32209k() {
        return this.f27887a;
    }

    /* JADX INFO: renamed from: m */
    public final void m32211m(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f27888b.lock();
        List<BaseCardData> addedCard = this.f27890d;
        Intrinsics.checkNotNullExpressionValue(addedCard, "addedCard");
        for (Object obj : addedCard) {
            if (Intrinsics.areEqual(((BaseCardData) obj).getCode(), code)) {
                addedCard.remove(obj);
                this.f27888b.unlock();
            }
        }
        obj = null;
        addedCard.remove(obj);
        this.f27888b.unlock();
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m32203e(CardListRsp cardListRsp, CardFlowParser cardFlowParser) {
        List<CardListRsp.Card> cardList = cardListRsp.getCardList();
        ArrayList arrayList = new ArrayList();
        for (Object obj : cardList) {
            if (ExtensionKt.m32183i((CardListRsp.Card) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            cardFlowParser.m32210l((CardListRsp.Card) it.next());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public final void m32210l(CardListRsp.Card card) {
        Object objM103844constructorimpl;
        Object objNewInstance;
        BaseCardData baseCardData;
        Boolean boolValueOf;
        Class<?> clsM32217b;
        BaseCardData baseCardDataM32205c;
        String strMo29088j = mo29088j(card.getCode());
        if (card.getHomeVisible() != 0 && strMo29088j.length() > 0) {
            try {
                Result.Companion companion = Result.INSTANCE;
                JsonObject jsonObject = (JsonObject) C27099x.m66913c(strMo29088j, JsonObject.class);
                if (jsonObject != null && (baseCardDataM32205c = m32205c(jsonObject)) != null) {
                    String code = baseCardDataM32205c.getCode();
                    if (code == null || code.length() == 0) {
                        baseCardDataM32205c.setCode(card.getCode());
                    }
                    this.f27890d.add(baseCardDataM32205c);
                    return;
                }
                return;
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(Result.m103844constructorimpl(ResultKt.createFailure(th2)));
                if (thM103847exceptionOrNullimpl != null) {
                    C44128b.m97263g(this.f27889c, thM103847exceptionOrNullimpl);
                    C43846g.m96568c(new CardFlowException(thM103847exceptionOrNullimpl, this.f27889c, false, null, 8, null), null, 2, null);
                    return;
                }
                return;
            }
        }
        if (card.getHomeVisible() == 1) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                ClassMapping classMapping = this.f27887a.get(card.getType());
                if (classMapping != null && (clsM32217b = classMapping.m32217b()) != null) {
                    objNewInstance = clsM32217b.newInstance();
                } else {
                    objNewInstance = null;
                }
                if (objNewInstance instanceof BaseCardData) {
                    baseCardData = (BaseCardData) objNewInstance;
                } else {
                    baseCardData = null;
                }
                if (baseCardData != null) {
                    baseCardData.setCode(card.getCode());
                    baseCardData.setType(card.getType());
                    boolValueOf = Boolean.valueOf(this.f27890d.add(baseCardData));
                } else {
                    boolValueOf = null;
                }
                objM103844constructorimpl = Result.m103844constructorimpl(boolValueOf);
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th3));
            }
            Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl2 != null) {
                C44128b.m97263g(this.f27889c, thM103847exceptionOrNullimpl2);
                C43846g.m96568c(new CardFlowException(thM103847exceptionOrNullimpl2, this.f27889c, false, null, 8, null), null, 2, null);
            }
        }
    }
}
