package com.kubi.sdk.viewbindingdelegate.base;

import androidx.exifinterface.media.ExifInterface;
import androidx.viewbinding.ViewBinding;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.kubi.sdk.viewbindingdelegate.base.a */
/* JADX INFO: compiled from: ViewBindingProperty.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u0001*\n\b\u0001\u0010\u0004 \u0001*\u00020\u00032\u00020\u0001J&\u0010\b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u00002\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H¦\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/sdk/viewbindingdelegate/base/a;", "", "R", "Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Landroidx/viewbinding/ViewBinding;", "sdk_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public interface InterfaceC24293a<R, T extends ViewBinding> {
    @Nullable
    T getValue(@NotNull R thisRef, @NotNull KProperty<?> property);
}
