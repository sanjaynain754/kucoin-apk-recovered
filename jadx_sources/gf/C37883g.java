package gf;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.utils.extensions.C27041f;
import io.reactivex.functions.Consumer;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: gf.g */
/* JADX INFO: compiled from: CheckUtils.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0080\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00062 \u0010\u0007\u001a\u001c\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\t0\b\u0012\u0004\u0012\u00020\u00010\u00062\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\u001a\u001e\u0010\u000f\u001a\u00020\u00012\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00110\b\u001a\u001e\u0010\u0012\u001a\u00020\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00140\b¨\u0006\u0015"}, m90084d2 = {"checkData", "", ExifInterface.GPS_DIRECTION_TRUE, "key", "", "localQuery", "Lkotlin/Function1;", "remoteFetch", "Lio/reactivex/functions/Consumer;", "", "matchCondition", "Lkotlin/Function2;", "", "logTag", "callBack", "checkSymbol", "symbol", "Lcom/kubi/data/entity/SymbolInfoEntity;", "checkCoin", "coin", "Lcom/kubi/data/entity/CoinInfoEntity;", "LDataProvider_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCheckUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckUtils.kt\ncom/kubi/data/coin/CheckUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,85:1\n295#2,2:86\n*S KotlinDebug\n*F\n+ 1 CheckUtils.kt\ncom/kubi/data/coin/CheckUtilsKt\n*L\n38#1:86,2\n*E\n"})
public final class C37883g {
    /* JADX INFO: renamed from: l */
    public static final void m85556l(String str, Consumer consumer, Function2 function2, List list) throws Exception {
        Object obj = null;
        if (list != null) {
            for (Object obj2 : list) {
                if (((Boolean) function2.invoke(obj2, str)).booleanValue()) {
                    obj = obj2;
                    break;
                }
            }
        }
        if (obj != null) {
            consumer.accept(obj);
            return;
        }
        C44128b.m97260d((char) 35813 + str + "无远端数据or请求失败or无缓存");
    }

    /* JADX INFO: renamed from: f */
    public static final void m85550f(@Nullable String str, @NotNull Consumer<CoinInfoEntity> callBack) throws Exception {
        String strM66677q;
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        m85555k((str == null || (strM66677q = C27041f.m66677q(str)) == null) ? null : C27041f.m66668h(strM66677q), new Function1() { // from class: gf.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C37883g.m85551g((String) obj);
            }
        }, new Function1() { // from class: gf.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C37883g.m85552h((Consumer) obj);
            }
        }, new Function2() { // from class: gf.d
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(C37883g.m85554j((CoinInfoEntity) obj, (String) obj2));
            }
        }, "coinInfo", callBack);
    }

    /* JADX INFO: renamed from: g */
    public static final CoinInfoEntity m85551g(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C37890n.f85269a.m85613u(it);
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m85552h(final Consumer consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        C37890n.f85269a.mo85595j(new Consumer() { // from class: gf.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                C37883g.m85553i(consumer, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m85554j(CoinInfoEntity entity, String str) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return Intrinsics.areEqual(entity.getCurrency(), str) || Intrinsics.areEqual(entity.getCode(), str);
    }

    /* JADX INFO: renamed from: k */
    public static final <T> void m85555k(@Nullable final String str, @NotNull Function1<? super String, ? extends T> localQuery, @NotNull Function1<? super Consumer<List<T>>, Unit> remoteFetch, @NotNull final Function2<? super T, ? super String, Boolean> matchCondition, @NotNull String logTag, @NotNull final Consumer<T> callBack) throws Exception {
        Intrinsics.checkNotNullParameter(localQuery, "localQuery");
        Intrinsics.checkNotNullParameter(remoteFetch, "remoteFetch");
        Intrinsics.checkNotNullParameter(matchCondition, "matchCondition");
        Intrinsics.checkNotNullParameter(logTag, "logTag");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        if (str == null || str.length() == 0) {
            return;
        }
        T tInvoke = localQuery.invoke(str);
        if (tInvoke != null) {
            callBack.accept(tInvoke);
            return;
        }
        remoteFetch.invoke(new Consumer() { // from class: gf.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                C37883g.m85556l(str, callBack, matchCondition, (List) obj);
            }
        });
        C44128b.m97260d((char) 35813 + str + (char) 30340 + logTag + "为null");
    }

    /* JADX INFO: renamed from: i */
    public static final void m85553i(Consumer consumer, List list) throws Exception {
        consumer.accept(list);
    }
}
