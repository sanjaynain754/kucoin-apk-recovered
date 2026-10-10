package a70;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.router.core.Router;
import com.kubi.user.account.AccountChange;
import com.kubi.user.account.AccountChangeType;
import com.kubi.user.model.LoginUserEntity;
import com.kubi.utils.C27099x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p777xx.C46337a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: renamed from: a70.b */
/* JADX INFO: compiled from: MultiAccountManager.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\n¢\u0006\u0002\u0010\u000bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rJ\u0014\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\rJ\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0005J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0016J\u000e\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0016J \u0010\u001a\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0016J\u000e\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0005J\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\rJ\u0006\u0010 \u001a\u00020\u000fJ\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0002J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0002J\u0016\u0010#\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0002J\u0012\u0010$\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0012\u001a\u00020\u0005H\u0002J\u0018\u0010%\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0016H\u0002J\u0010\u0010&\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0005H\u0002J\u0010\u0010'\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0005H\u0002J\b\u0010(\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006)"}, m90084d2 = {"Lcom/kubi/user/account/MultiAccountManager;", "", "<init>", "()V", "TAG", "", "SEPARATOR", "withAccountStateLock", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getAccountIdList", "", "saveAccountIdList", "", "idList", "addAccountId", "id", "promoteAccountIdToFront", "removeAccountId", "getAccountInfo", "Lcom/kubi/user/model/LoginUserEntity;", "saveAccountBucketOnly", "loginUserEntity", "saveAccountInfo", "saveRefreshedAccountInfoIfTokenMatches", "accountId", "expectedAccessToken", "refreshedEntity", "removeAccountInfo", "getAllAccountInfoList", "clearAll", "readRawIdListFromStorage", "readAccountIdListFromStorage", "writeAccountIdListToStorage", "readAccountInfoFromStorage", "writeAccountInfoToStorage", "promoteAccountIdToFrontInternal", "removeAccountIdInternal", "notifyAccountIdListChanged", "LUser_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMultiAccountManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiAccountManager.kt\ncom/kubi/user/account/MultiAccountManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 KuEmitter.kt\ncom/kubi/router/emitter/KuEmitter\n*L\n1#1,230:1\n1#2:231\n1#2:244\n1#2:268\n23#3,2:232\n23#3,2:248\n32#3:251\n135#3,2:255\n126#3,2:257\n23#3,2:259\n126#3,2:261\n32#3:263\n23#3,2:264\n1617#4,9:234\n1869#4:243\n1870#4:245\n1626#4:246\n1869#4:247\n1870#4:250\n774#4:252\n865#4,2:253\n2756#4:267\n16#5:266\n*S KotlinDebug\n*F\n+ 1 MultiAccountManager.kt\ncom/kubi/user/account/MultiAccountManager\n*L\n152#1:244\n224#1:268\n144#1:232,2\n160#1:248,2\n168#1:251\n180#1:255,2\n184#1:257,2\n189#1:259,2\n190#1:261,2\n194#1:263\n200#1:264,2\n152#1:234,9\n152#1:243\n152#1:245\n152#1:246\n159#1:247\n159#1:250\n170#1:252\n170#1:253,2\n224#1:267\n224#1:266\n*E\n"})
public final class C0188b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C0188b f557a = new C0188b();

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<LoginUserEntity> m737c() {
        ArrayList arrayList;
        synchronized (this) {
            List<String> listM741g = f557a.m741g();
            arrayList = new ArrayList();
            Iterator<T> it = listM741g.iterator();
            while (it.hasNext()) {
                LoginUserEntity loginUserEntityM742h = f557a.m742h((String) it.next());
                if (loginUserEntityM742h != null) {
                    arrayList.add(loginUserEntityM742h);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final void m735a(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this) {
            f557a.m739e(id2);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final LoginUserEntity m736b(@NotNull String id2) {
        LoginUserEntity loginUserEntityM742h;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this) {
            loginUserEntityM742h = f557a.m742h(id2);
        }
        return loginUserEntityM742h;
    }

    /* JADX INFO: renamed from: d */
    public final void m738d() {
        C46337a c46337a = C46337a.f103912a;
        for (InterfaceC0187a interfaceC0187a : Router.f46192a.m56190l(InterfaceC0187a.class)) {
            C44128b.m97266j("MultiAccountManager", "saveAccountIdList");
            interfaceC0187a.invoke(new AccountChange("", AccountChangeType.TYPE_1));
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m739e(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this) {
            f557a.m740f(id2);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: h */
    public final LoginUserEntity m742h(String str) {
        String strM102326h = C46392a.m102326h(C0189c.f558a.m752a(str), "");
        if (StringsKt.isBlank(strM102326h)) {
            return null;
        }
        return (LoginUserEntity) C27099x.m66912b(strM102326h, LoginUserEntity.class);
    }

    /* JADX INFO: renamed from: i */
    public final List<String> m743i() {
        String strM102326h = C46392a.m102326h(C0189c.f558a.m754c(), "");
        if (StringsKt.isBlank(strM102326h)) {
            return CollectionsKt.emptyList();
        }
        List listSplit$default = StringsKt.split$default((CharSequence) strM102326h, new String[]{","}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSplit$default) {
            if (!StringsKt.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public final void m744j(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this) {
            f557a.m745k(id2);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m746l(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this) {
            try {
                if (!StringsKt.isBlank(id2)) {
                    C46392a.m102333p(C0189c.f558a.m752a(id2), "");
                    f557a.m745k(id2);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m747m(@NotNull LoginUserEntity loginUserEntity) {
        Intrinsics.checkNotNullParameter(loginUserEntity, "loginUserEntity");
        synchronized (this) {
            try {
                String str = loginUserEntity.id;
                if (!StringsKt.isBlank(str)) {
                    C0188b c0188b = f557a;
                    c0188b.m751q(str, loginUserEntity);
                    if (loginUserEntity.getType() != 3) {
                        c0188b.m740f(str);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final LoginUserEntity m748n(@NotNull String accountId, @NotNull String expectedAccessToken, @NotNull LoginUserEntity refreshedEntity) {
        LoginUserEntity loginUserEntity;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(expectedAccessToken, "expectedAccessToken");
        Intrinsics.checkNotNullParameter(refreshedEntity, "refreshedEntity");
        synchronized (this) {
            try {
                C0188b c0188b = f557a;
                LoginUserEntity loginUserEntityM742h = c0188b.m742h(accountId);
                loginUserEntity = null;
                if (loginUserEntityM742h != null) {
                    String str = loginUserEntityM742h.token;
                    if (str == null) {
                        str = "";
                    }
                    if (!Intrinsics.areEqual(str, expectedAccessToken)) {
                        loginUserEntityM742h = null;
                    }
                    if (loginUserEntityM742h != null) {
                        loginUserEntityM742h.token = refreshedEntity.token;
                        loginUserEntityM742h.accessTokenExpireAt = refreshedEntity.accessTokenExpireAt;
                        loginUserEntityM742h.refreshToken = refreshedEntity.refreshToken;
                        loginUserEntityM742h.refreshTokenExpireAt = refreshedEntity.refreshTokenExpireAt;
                        loginUserEntityM742h.generateTime = refreshedEntity.generateTime;
                        c0188b.m751q(accountId, loginUserEntityM742h);
                        if (loginUserEntityM742h.getType() != 3) {
                            c0188b.m740f(accountId);
                        }
                        loginUserEntity = loginUserEntityM742h;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return loginUserEntity;
    }

    /* JADX INFO: renamed from: o */
    public final <T> T m749o(@NotNull Function0<? extends T> block) {
        T tInvoke;
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (this) {
            tInvoke = block.invoke();
        }
        return tInvoke;
    }

    /* JADX INFO: renamed from: p */
    public final void m750p(List<String> list) {
        C0189c c0189c = C0189c.f558a;
        C46392a.m102333p(c0189c.m754c(), CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null));
        C46392a.m102328k(c0189c.m755d(), true);
    }

    /* JADX INFO: renamed from: q */
    public final void m751q(String str, LoginUserEntity loginUserEntity) {
        C46392a.m102333p(C0189c.f558a.m752a(str), C27099x.m66919i(loginUserEntity, false, 2, null));
    }

    /* JADX INFO: renamed from: f */
    public final void m740f(String str) {
        if (StringsKt.isBlank(str)) {
            return;
        }
        List<String> mutableList = CollectionsKt.toMutableList((Collection) m741g());
        mutableList.remove(str);
        mutableList.add(0, str);
        m750p(mutableList);
        m738d();
    }

    /* JADX INFO: renamed from: g */
    public final List<String> m741g() {
        List<String> listM743i = m743i();
        if (!listM743i.isEmpty()) {
            C0189c c0189c = C0189c.f558a;
            if (!C46392a.m102322d(c0189c.m755d(), false)) {
                C46392a.m102328k(c0189c.m755d(), true);
                return listM743i;
            }
        }
        return listM743i;
    }

    /* JADX INFO: renamed from: k */
    public final void m745k(String str) {
        if (!StringsKt.isBlank(str)) {
            List<String> mutableList = CollectionsKt.toMutableList((Collection) m741g());
            if (mutableList.remove(str)) {
                m750p(mutableList);
                m738d();
            }
        }
    }
}
