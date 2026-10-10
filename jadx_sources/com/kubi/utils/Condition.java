package com.kubi.utils;

import android.os.Build;
import androidx.annotation.Keep;
import com.kubi.utils.extensions.C27024b;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: FragmentStateFixer.kt */
/* JADX INFO: loaded from: classes23.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\b\u001a\u00020\tR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m90084d2 = {"Lcom/kubi/utils/Condition;", "", "devices", "", "", "(Ljava/util/List;)V", "getDevices", "()Ljava/util/List;", "check", "", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class Condition {

    @Nullable
    private final List<String> devices;

    /* JADX WARN: Multi-variable type inference failed */
    public Condition() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public Condition(@Nullable List<String> list) {
        this.devices = list;
    }

    public final boolean check() {
        return C27024b.m66560c(this.devices).contains(Build.BRAND + ':' + Build.MODEL);
    }

    @Nullable
    public final List<String> getDevices() {
        return this.devices;
    }

    public /* synthetic */ Condition(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list);
    }
}
