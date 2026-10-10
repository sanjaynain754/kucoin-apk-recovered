package th;

import com.kubi.kumex.data.BKuMexSpProxy;
import com.kubi.kumex.data.platform.model.PreferencesEntity;
import com.kubi.restful.AbstractC23185a;
import com.kubi.restful.InterfaceC23192h;
import com.kubi.restful.InterfaceC23193i;
import com.kubi.restful.InterfaceC23194j;
import com.kubi.restful.InterfaceC23195k;
import com.kubi.restful.InterfaceC23196l;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: th.f */
/* JADX INFO: compiled from: IPlatformSp.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J\u001c\u0010\n\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/data/platform/IPlatformSp;", "", "insertPreferencesSettings", "", "value", "Lcom/kubi/kumex/data/platform/model/PreferencesEntity;", "proxy", "Lcom/kubi/restful/BaseProxy;", "type", "Ljava/lang/reflect/Type;", "getPreferencesSettings", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC44984f {
    @InterfaceC23192h(key = "bkumex_preferences_settings")
    /* JADX INFO: renamed from: c */
    boolean m99534c(@InterfaceC23196l @NotNull PreferencesEntity preferencesEntity, @InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23194j(m103799default = "{}", key = "bkumex_preferences_settings")
    @NotNull
    /* JADX INFO: renamed from: d */
    PreferencesEntity m99535d(@InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    /* JADX INFO: renamed from: a */
    static /* synthetic */ boolean m99532a(InterfaceC44984f interfaceC44984f, PreferencesEntity preferencesEntity, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insertPreferencesSettings");
        }
        if ((i11 & 2) != 0) {
            abstractC23185a = BKuMexSpProxy.f28816c.getInstance();
        }
        if ((i11 & 4) != 0) {
            type = Boolean.TYPE;
        }
        return interfaceC44984f.m99534c(preferencesEntity, abstractC23185a, type);
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ PreferencesEntity m99533b(InterfaceC44984f interfaceC44984f, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPreferencesSettings");
        }
        if ((i11 & 1) != 0) {
            abstractC23185a = BKuMexSpProxy.f28816c.getInstance();
        }
        if ((i11 & 2) != 0) {
            type = PreferencesEntity.class;
        }
        return interfaceC44984f.m99535d(abstractC23185a, type);
    }
}
