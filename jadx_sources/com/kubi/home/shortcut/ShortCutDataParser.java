package com.kubi.home.shortcut;

import android.text.TextUtils;
import cn.jiguang.privates.common.constants.JCommonConstants;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.gson.reflect.TypeToken;
import com.kubi.home.R$mipmap;
import com.kubi.home.R$string;
import com.kubi.home.exception.HomeException;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.core.C27029c;
import dj.C36719d;
import dj.C36722g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: com.kubi.home.shortcut.g, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ShortCutDataParser.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0002J\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0016\u0010\u000f\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0002J\u0010\u0010\u0012\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/home/shortcut/ShortCutDataParser;", "", "<init>", "()V", "cacheData", "", "Lcom/kubi/home/shortcut/FunctionEntity;", "initCardData", "", "getCardData", "buildEmptyMenuList", "", "buildFunctionEntityList", "functions", "getServerHomeMenuList", "saveHomeMenuList", "addMoreMenu", "showMenu", "saveMoreIcon", "iconResponse", "Lcom/kubi/home/shortcut/IconResponse;", "getMoreIcon", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nShortCutDataParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShortCutDataParser.kt\ncom/kubi/home/shortcut/ShortCutDataParser\n+ 2 HomeIssue.kt\ncom/kubi/home/exception/HomeIssueKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n+ 6 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 HomeStoreId.kt\ncom/kubi/home/common/ex/HomeStoreIdKt\n+ 9 StorageId.kt\ncom/kubi/utils/storage/StorageId\n*L\n1#1,222:1\n47#2,2:223\n1878#3,3:225\n774#3:231\n865#3,2:232\n1374#3:234\n1460#3,5:235\n774#3:240\n865#3,2:241\n1869#3:243\n1761#3,3:244\n1870#3:247\n1869#3:248\n1870#3:250\n1563#3:251\n1634#3,3:252\n774#3:255\n865#3,2:256\n1374#3:258\n1460#3,5:259\n1869#3,2:264\n32#4:228\n32#4:266\n23#4,2:273\n23#4,2:275\n32#4:277\n25#5:229\n57#5,2:278\n25#5:280\n59#5,3:282\n149#6:230\n160#6,4:267\n149#6:281\n1#7:249\n109#8:271\n46#9:272\n*S KotlinDebug\n*F\n+ 1 ShortCutDataParser.kt\ncom/kubi/home/shortcut/ShortCutDataParser\n*L\n37#1:223,2\n67#1:225,3\n99#1:231\n99#1:232,2\n99#1:234\n99#1:235,5\n100#1:240\n100#1:241,2\n100#1:243\n102#1:244,3\n100#1:247\n110#1:248\n110#1:250\n136#1:251\n136#1:252,3\n137#1:255\n137#1:256,2\n137#1:258\n137#1:259,5\n138#1:264,2\n77#1:228\n156#1:266\n167#1:273,2\n212#1:275,2\n220#1:277\n86#1:229\n220#1:278,2\n220#1:280\n220#1:282,3\n86#1:230\n158#1:267,4\n220#1:281\n167#1:271\n167#1:272\n*E\n"})
public final class ShortCutDataParser {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ShortCutDataParser f26308a = new ShortCutDataParser();

    /* JADX INFO: renamed from: b */
    @Nullable
    public static List<FunctionEntity> f26309b;

    /* JADX INFO: renamed from: com.kubi.home.shortcut.g$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/utils/extensions/JsonExKt$parseJson$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class a extends TypeToken<List<? extends String>> {
    }

    /* JADX INFO: renamed from: com.kubi.home.shortcut.g$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0004"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/utils/extensions/JsonExKt$parseJson$$inlined$fromJson$1", "com/kubi/utils/extensions/JsonExKt$toEntity$lambda$1$$inlined$parseJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class b extends TypeToken<IconResponse> {
    }

    /* JADX INFO: renamed from: com.kubi.home.shortcut.g$c */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class c extends TypeToken<List<? extends FunctionEntity>> {
    }

    /* JADX INFO: renamed from: a */
    public final List<FunctionEntity> m30393a(List<FunctionEntity> list) {
        IconResponse iconResponseM30397e = m30397e();
        if (iconResponseM30397e == null) {
            list.add(new FunctionEntity(null, C27017c.f54310a.m66516f(R$string.more, new Object[0]), null, null, Integer.valueOf(DayNightThemeManager.f28592a.m33187l() ? R$mipmap.ic_home_menu_more : R$mipmap.ic_home_menu_more_night), "home/actionEdit", false, null, null, null, false, JCommonConstants.RemoteWhat.ON_NETWORK_CONNECTED, null));
            return list;
        }
        list.add(new FunctionEntity(null, C27017c.f54310a.m66516f(R$string.more, new Object[0]), iconResponseM30397e.getDayIcon(), iconResponseM30397e.getDarkIcon(), null, "home/actionEdit", false, null, null, null, false, 2001, null));
        return list;
    }

    /* JADX INFO: renamed from: b */
    public final List<FunctionEntity> m30394b() {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < 10; i11++) {
            arrayList.add(new FunctionEntity(null, null, null, null, Integer.valueOf(R$mipmap.ic_home_menu_default), null, false, null, null, null, true, 1007, null));
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<FunctionEntity> m30395c(@NotNull List<FunctionEntity> functions) {
        List listDrop;
        Object next;
        Intrinsics.checkNotNullParameter(functions, "functions");
        if (functions.isEmpty()) {
            return m30394b();
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (Object obj : functions) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(((FunctionEntity) obj).getId(), "1111")) {
                i12 = i13;
            }
            i13 = i14;
        }
        ArrayList<FunctionEntity> children = functions.get(i12).getChildren();
        List<FunctionEntity> list = null;
        List<FunctionEntity> mutableList = children != null ? CollectionsKt.toMutableList((Collection) children) : null;
        if (mutableList == null) {
            return CollectionsKt.emptyList();
        }
        String strM102326h = C36722g.m82292f() ? C46392a.m102326h(C36719d.f79632a.m82277v(), "") : "";
        if (!TextUtils.isEmpty(strM102326h)) {
            C27099x c27099x = C27099x.f54458a;
            List<String> list2 = (List) C27099x.m66914d(strM102326h, new a().getType());
            if (mutableList.size() > 4) {
                mutableList = CollectionsKt.toMutableList((Collection) mutableList.subList(0, 4));
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(mutableList);
            if (!list2.isEmpty()) {
                List mutableList2 = CollectionsKt.toMutableList((Collection) functions);
                mutableList2.remove(i12);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : mutableList2) {
                    if (((FunctionEntity) obj2).getChildren() != null) {
                        arrayList3.add(obj2);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    ArrayList<FunctionEntity> children2 = ((FunctionEntity) it.next()).getChildren();
                    Intrinsics.checkNotNull(children2);
                    CollectionsKt.addAll(arrayList4, children2);
                }
                ArrayList<FunctionEntity> arrayList5 = new ArrayList();
                for (Object obj3 : arrayList4) {
                    if (CollectionsKt.contains(list2, ((FunctionEntity) obj3).getId())) {
                        arrayList5.add(obj3);
                    }
                }
                for (FunctionEntity functionEntity : arrayList5) {
                    if (mutableList == null || !mutableList.isEmpty()) {
                        Iterator<T> it2 = mutableList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (Intrinsics.areEqual(((FunctionEntity) it2.next()).getId(), functionEntity.getId())) {
                                    i11++;
                                    break;
                                }
                            }
                        }
                    }
                    arrayList2.add(functionEntity);
                }
                for (String str : list2) {
                    Iterator it3 = arrayList2.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                    } while (!Intrinsics.areEqual(str, ((FunctionEntity) next).getId()));
                    FunctionEntity functionEntity2 = (FunctionEntity) next;
                    if (functionEntity2 != null) {
                        arrayList.add(functionEntity2);
                    }
                }
            }
            if (i11 > 0) {
                ArrayList<FunctionEntity> children3 = functions.get(i12).getChildren();
                if (children3 != null && (listDrop = CollectionsKt.drop(children3, 4)) != null) {
                    list = CollectionsKt.toList(listDrop);
                }
                if (list != null) {
                    for (FunctionEntity functionEntity3 : list) {
                        if (!CollectionsKt.contains(list2, functionEntity3.getId())) {
                            arrayList.add(functionEntity3);
                            i11--;
                            if (i11 == 0) {
                                break;
                            }
                        }
                    }
                }
            }
            mutableList = arrayList;
        } else if (mutableList.size() > 19) {
            mutableList = CollectionsKt.toMutableList((Collection) mutableList.subList(0, 19));
        }
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(mutableList, 10));
        Iterator<T> it4 = mutableList.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((FunctionEntity) it4.next()).getId());
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj4 : functions) {
            if (((FunctionEntity) obj4).getChildren() != null) {
                arrayList7.add(obj4);
            }
        }
        ArrayList<FunctionEntity> arrayList8 = new ArrayList();
        Iterator it5 = arrayList7.iterator();
        while (it5.hasNext()) {
            ArrayList<FunctionEntity> children4 = ((FunctionEntity) it5.next()).getChildren();
            Intrinsics.checkNotNull(children4);
            CollectionsKt.addAll(arrayList8, children4);
        }
        for (FunctionEntity functionEntity4 : arrayList8) {
            functionEntity4.setEditable(!arrayList6.contains(functionEntity4.getId()));
        }
        FunctionEntity functionEntity5 = functions.get(i12);
        ArrayList<FunctionEntity> arrayList9 = new ArrayList<>();
        arrayList9.addAll(mutableList);
        functionEntity5.setChildren(arrayList9);
        ShortCutDataParser shortCutDataParser = f26308a;
        shortCutDataParser.m30400h(functions);
        shortCutDataParser.m30393a(mutableList);
        f26309b = mutableList;
        return mutableList;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final List<FunctionEntity> m30396d() {
        return f26309b;
    }

    /* JADX INFO: renamed from: e */
    public final IconResponse m30397e() {
        Object objM103844constructorimpl;
        String strM102326h = C46392a.m102326h(C36719d.f79632a.m82273r(), "");
        try {
            Result.Companion companion = Result.INSTANCE;
            C27099x c27099x = C27099x.f54458a;
            objM103844constructorimpl = Result.m103844constructorimpl(C27099x.m66914d(strM102326h, new b().getType()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97262f(JPushConstants.Analysis.KEY_JSON, "数据转换失败", thM103847exceptionOrNullimpl);
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (IconResponse) objM103844constructorimpl;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final List<FunctionEntity> m30398f() {
        Object objM66914d;
        String strM102326h = C46392a.m102326h(C36719d.f79632a.m82276u(), "");
        if (strM102326h.length() == 0) {
            return CollectionsKt.emptyList();
        }
        try {
            C27099x c27099x = C27099x.f54458a;
            objM66914d = C27099x.m66914d(strM102326h, new c().getType());
        } catch (Throwable unused) {
            objM66914d = null;
        }
        List<FunctionEntity> list = (List) objM66914d;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* JADX INFO: renamed from: g */
    public final void m30399g() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            ShortCutDataParser shortCutDataParser = f26308a;
            f26309b = shortCutDataParser.m30395c(shortCutDataParser.m30398f());
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43846g.m96568c(new HomeException(thM103847exceptionOrNullimpl, "ShortCutDataParser", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m30400h(List<FunctionEntity> list) {
        StorageId<String> storageIdM82265j = C36719d.f79632a.m82265j();
        String strI = UserInfo.a.i();
        StorageId storageId = new StorageId(storageIdM82265j.getCategory(), storageIdM82265j.getKey() + strI, storageIdM82265j.getStorageType(), storageIdM82265j.getSupportLegacy());
        String strM66606i = C27029c.m66606i(list);
        Intrinsics.checkNotNullExpressionValue(strM66606i, "toJson(...)");
        C46392a.m102333p(storageId, strM66606i);
    }

    /* JADX INFO: renamed from: i */
    public final void m30401i(@Nullable IconResponse iconResponse) {
        if (iconResponse != null) {
            StorageId<String> storageIdM82273r = C36719d.f79632a.m82273r();
            String strM66606i = C27029c.m66606i(iconResponse);
            Intrinsics.checkNotNullExpressionValue(strM66606i, "toJson(...)");
            C46392a.m102333p(storageIdM82273r, strM66606i);
        }
    }
}
