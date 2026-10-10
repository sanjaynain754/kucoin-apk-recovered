package com.tencent.rmonitor.base.meta;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.tencent.bugly.common.utils.RecyclablePool;
import com.tencent.bugly.proguard.C33590cg;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/tencent/rmonitor/base/meta/InspectUUID;", "Lcom/tencent/bugly/common/utils/RecyclablePool$Recyclable;", "()V", C33590cg.f69440j, "", "className", "digest", "uuid", "weakObj", "Ljava/lang/ref/WeakReference;", "", "reset", "", "toString", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class InspectUUID extends RecyclablePool.Recyclable {

    @JvmField
    @Nullable
    public WeakReference<Object> weakObj;

    @JvmField
    @NotNull
    public String className = "";

    @JvmField
    @NotNull
    public String digest = "";

    @JvmField
    @NotNull
    public String uuid = "";

    @JvmField
    @NotNull
    public String cache = "";

    @Override // com.tencent.bugly.common.utils.RecyclablePool.Recyclable
    public void reset() {
        this.weakObj = null;
        this.digest = "";
        this.uuid = "";
        this.className = "";
        this.cache = "";
    }

    @NotNull
    public String toString() {
        if (this.cache.length() == 0) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append(this.className);
            sb2.append("@");
            String str = this.uuid;
            if (str != null) {
                sb2.append(str);
            }
            if (!TextUtils.isEmpty(this.digest)) {
                sb2.append("_");
                sb2.append(this.digest);
            }
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(64).apply …\n            }.toString()");
            this.cache = string;
        }
        return this.cache;
    }
}
