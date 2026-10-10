package com.jumio.core.plugins;

import androidx.exifinterface.media.ExifInterface;
import com.jumio.core.Injected;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jumio.core.EnumC40608V2;
import jumio.core.EnumC40613W2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Injected
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H&J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H&J!\u0010\u0013\u001a\u0004\u0018\u0001H\u0014\"\b\b\u0000\u0010\u0014*\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0004H&¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0018H&R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019À\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/plugins/PluginRegistryInterface;", "", "availablePlugins", "", "Lcom/jumio/core/plugins/PluginModule;", "getAvailablePlugins", "()Ljava/util/List;", "availablePluginNames", "", "getAvailablePluginNames", "linkedModulesCode", "getLinkedModulesCode", "()Ljava/lang/String;", "hasPlugin", "", "pluginModule", "hasDependency", "pluginDependency", "Lcom/jumio/core/plugins/PluginDependency;", "getPlugin", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/jumio/core/plugins/Plugin;", "(Lcom/jumio/core/plugins/PluginModule;)Lcom/jumio/core/plugins/Plugin;", "clearCache", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPluginRegistryInterface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluginRegistryInterface.kt\ncom/jumio/core/plugins/PluginRegistryInterface\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,39:1\n3829#2:40\n4344#2,2:41\n13402#2,2:51\n13402#2,2:53\n1557#3:43\n1628#3,3:44\n1557#3:47\n1628#3,3:48\n*S KotlinDebug\n*F\n+ 1 PluginRegistryInterface.kt\ncom/jumio/core/plugins/PluginRegistryInterface\n*L\n10#1:40\n10#1:41,2\n25#1:51,2\n28#1:53,2\n11#1:43\n11#1:44,3\n20#1:47\n20#1:48,3\n*E\n"})
public interface PluginRegistryInterface {
    void clearCache();

    @Nullable
    <T extends Plugin> T getPlugin(@NotNull EnumC40613W2 enumC40613W2);

    boolean hasDependency(@NotNull EnumC40608V2 enumC40608V2);

    boolean hasPlugin(@NotNull EnumC40613W2 enumC40613W2);

    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        @NotNull
        public static List<String> getAvailablePluginNames(@NotNull PluginRegistryInterface pluginRegistryInterface) {
            return PluginRegistryInterface.super.getAvailablePluginNames();
        }

        @Deprecated
        @NotNull
        public static List<EnumC40613W2> getAvailablePlugins(@NotNull PluginRegistryInterface pluginRegistryInterface) {
            return PluginRegistryInterface.super.getAvailablePlugins();
        }

        @Deprecated
        @NotNull
        public static String getLinkedModulesCode(@NotNull PluginRegistryInterface pluginRegistryInterface) {
            return PluginRegistryInterface.super.getLinkedModulesCode();
        }
    }

    @NotNull
    default List<String> getAvailablePluginNames() {
        List<EnumC40613W2> availablePlugins = getAvailablePlugins();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(availablePlugins, 10));
        Iterator<T> it = availablePlugins.iterator();
        while (it.hasNext()) {
            arrayList.add(((EnumC40613W2) it.next()).name());
        }
        return arrayList;
    }

    @NotNull
    default List<EnumC40613W2> getAvailablePlugins() {
        EnumC40613W2[] enumC40613W2ArrValues = EnumC40613W2.values();
        ArrayList<EnumC40613W2> arrayList = new ArrayList();
        for (EnumC40613W2 enumC40613W2 : enumC40613W2ArrValues) {
            if (!Intrinsics.areEqual(enumC40613W2.f90171a, "com.jumio.invalid") && enumC40613W2 != EnumC40613W2.EMULATOR && hasPlugin(enumC40613W2)) {
                arrayList.add(enumC40613W2);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (EnumC40613W2 enumC40613W3 : arrayList) {
            if (enumC40613W3 == EnumC40613W2.BARCODE_NATIVE) {
                enumC40613W3 = EnumC40613W2.BARCODE;
            }
            arrayList2.add(enumC40613W3);
        }
        return CollectionsKt.distinct(arrayList2);
    }

    @NotNull
    default String getLinkedModulesCode() {
        String str;
        EnumC40613W2[] enumC40613W2ArrValues = EnumC40613W2.values();
        int length = enumC40613W2ArrValues.length;
        String string = "";
        int i11 = 0;
        while (true) {
            String str2 = "0";
            if (i11 >= length) {
                break;
            }
            EnumC40613W2 enumC40613W2 = enumC40613W2ArrValues[i11];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            if (hasPlugin(enumC40613W2)) {
                str2 = "1";
            }
            sb2.append(str2);
            string = sb2.toString();
            i11++;
        }
        for (EnumC40608V2 enumC40608V2 : EnumC40608V2.values()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string);
            if (!hasDependency(enumC40608V2)) {
                str = "0";
            } else {
                str = "1";
            }
            sb3.append(str);
            string = sb3.toString();
        }
        return string;
    }
}
