package com.jumio.core.models;

import com.jumio.commons.PersistWith;
import com.jumio.core.model.StaticModel;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.concurrent.ConcurrentHashMap;
import jumio.core.AbstractC40677j;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u000b\u001a\u00020\u0007R\u001e\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/jumio/core/models/BackendModel;", "Lcom/jumio/core/model/StaticModel;", "<init>", "()V", "map", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/Class;", "", "checkAndIncreaseCounter", "", "clazz", TUIConstants.TUIContact.LIMIT, "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("BackendModel")
@SourceDebugExtension({"SMAP\nBackendModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackendModel.kt\ncom/jumio/core/models/BackendModel\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n72#2,2:28\n1#3:30\n*S KotlinDebug\n*F\n+ 1 BackendModel.kt\ncom/jumio/core/models/BackendModel\n*L\n22#1:28,2\n22#1:30\n*E\n"})
public final class BackendModel implements StaticModel {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f14189a = new ConcurrentHashMap();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        r2 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean checkAndIncreaseCounter(@NotNull Class<?> clazz, int limit) {
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (ArraysKt.contains((Class<?>[]) AbstractC40677j.f90296a, clazz)) {
            return false;
        }
        ConcurrentHashMap concurrentHashMap = this.f14189a;
        Object obj = concurrentHashMap.get(clazz);
        if (obj == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clazz, obj)) != null) {
            obj = objPutIfAbsent;
        }
        Integer num = (Integer) obj;
        this.f14189a.put(clazz, Integer.valueOf(num.intValue() + 1));
        return num.intValue() >= limit;
    }
}
