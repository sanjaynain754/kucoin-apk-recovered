package com.google.protobuf;

import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EnumKt.kt */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m90084d2 = {"Lcom/google/protobuf/EnumKt;", "", "()V", "Dsl", "protobuf-kotlin-lite"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class EnumKt {

    @NotNull
    public static final EnumKt INSTANCE = new EnumKt();

    /* JADX INFO: compiled from: EnumKt.kt */
    @Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0003?@AB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\"\u001a\u00020#H\u0001J\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020%J\u0006\u0010'\u001a\u00020%J\u0006\u0010(\u001a\u00020)J%\u0010*\u001a\u00020%*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0002\b+J%\u0010*\u001a\u00020%*\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00062\u0006\u0010\u000b\u001a\u00020\u0013H\u0007¢\u0006\u0002\b,J+\u0010-\u001a\u00020%*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070/H\u0007¢\u0006\u0002\b0J+\u0010-\u001a\u00020%*\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00062\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00130/H\u0007¢\u0006\u0002\b1J\u001d\u00102\u001a\u00020%*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0002\b3J\u001d\u00102\u001a\u00020%*\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0006H\u0007¢\u0006\u0002\b4J&\u00105\u001a\u00020%*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u000b\u001a\u00020\u0007H\u0087\n¢\u0006\u0002\b6J,\u00105\u001a\u00020%*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070/H\u0087\n¢\u0006\u0002\b7J&\u00105\u001a\u00020%*\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00062\u0006\u0010\u000b\u001a\u00020\u0013H\u0087\n¢\u0006\u0002\b8J,\u00105\u001a\u00020%*\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00062\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00130/H\u0087\n¢\u0006\u0002\b9J.\u0010:\u001a\u00020%*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010;\u001a\u00020<2\u0006\u0010\u000b\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b=J.\u0010:\u001a\u00020%*\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00062\u0006\u0010;\u001a\u00020<2\u0006\u0010\u000b\u001a\u00020\u0013H\u0087\u0002¢\u0006\u0002\b>R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00068F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\nR$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u00168G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\u001c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006B"}, m90084d2 = {"Lcom/google/protobuf/EnumKt$Dsl;", "", "_builder", "Lcom/google/protobuf/Enum$Builder;", "(Lcom/google/protobuf/Enum$Builder;)V", "enumvalue", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/google/protobuf/EnumValue;", "Lcom/google/protobuf/EnumKt$Dsl$EnumvalueProxy;", "getEnumvalue", "()Lcom/google/protobuf/kotlin/DslList;", "value", "", "name", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "options", "Lcom/google/protobuf/Option;", "Lcom/google/protobuf/EnumKt$Dsl$OptionsProxy;", "getOptions", "Lcom/google/protobuf/SourceContext;", "sourceContext", "getSourceContext", "()Lcom/google/protobuf/SourceContext;", "setSourceContext", "(Lcom/google/protobuf/SourceContext;)V", "Lcom/google/protobuf/Syntax;", "syntax", "getSyntax", "()Lcom/google/protobuf/Syntax;", "setSyntax", "(Lcom/google/protobuf/Syntax;)V", "_build", "Lcom/google/protobuf/Enum;", "clearName", "", "clearSourceContext", "clearSyntax", "hasSourceContext", "", "add", "addEnumvalue", "addOptions", "addAll", "values", "", "addAllEnumvalue", "addAllOptions", "clear", "clearEnumvalue", "clearOptions", "plusAssign", "plusAssignEnumvalue", "plusAssignAllEnumvalue", "plusAssignOptions", "plusAssignAllOptions", "set", "index", "", "setEnumvalue", "setOptions", "Companion", "EnumvalueProxy", "OptionsProxy", "protobuf-kotlin-lite"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final Enum.Builder _builder;

        /* JADX INFO: compiled from: EnumKt.kt */
        @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, m90084d2 = {"Lcom/google/protobuf/EnumKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/EnumKt$Dsl;", "builder", "Lcom/google/protobuf/Enum$Builder;", "protobuf-kotlin-lite"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @PublishedApi
            public final /* synthetic */ Dsl _create(Enum.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(Enum.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        /* JADX INFO: compiled from: EnumKt.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m90084d2 = {"Lcom/google/protobuf/EnumKt$Dsl$EnumvalueProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "protobuf-kotlin-lite"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
        public static final class EnumvalueProxy extends DslProxy {
            private EnumvalueProxy() {
            }
        }

        /* JADX INFO: compiled from: EnumKt.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m90084d2 = {"Lcom/google/protobuf/EnumKt$Dsl$OptionsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "protobuf-kotlin-lite"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        private Dsl(Enum.Builder builder) {
            this._builder = builder;
        }

        @PublishedApi
        public final /* synthetic */ Enum _build() {
            Enum enumBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(enumBuild, "_builder.build()");
            return enumBuild;
        }

        @JvmName(name = "addAllEnumvalue")
        public final /* synthetic */ void addAllEnumvalue(DslList dslList, Iterable values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllEnumvalue(values);
        }

        @JvmName(name = "addAllOptions")
        public final /* synthetic */ void addAllOptions(DslList dslList, Iterable values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllOptions(values);
        }

        @JvmName(name = "addEnumvalue")
        public final /* synthetic */ void addEnumvalue(DslList dslList, EnumValue value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addEnumvalue(value);
        }

        @JvmName(name = "addOptions")
        public final /* synthetic */ void addOptions(DslList dslList, Option value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addOptions(value);
        }

        @JvmName(name = "clearEnumvalue")
        public final /* synthetic */ void clearEnumvalue(DslList dslList) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.clearEnumvalue();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        @JvmName(name = "clearOptions")
        public final /* synthetic */ void clearOptions(DslList dslList) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.clearOptions();
        }

        public final void clearSourceContext() {
            this._builder.clearSourceContext();
        }

        public final void clearSyntax() {
            this._builder.clearSyntax();
        }

        public final /* synthetic */ DslList getEnumvalue() {
            List<EnumValue> enumvalueList = this._builder.getEnumvalueList();
            Intrinsics.checkNotNullExpressionValue(enumvalueList, "_builder.getEnumvalueList()");
            return new DslList(enumvalueList);
        }

        @JvmName(name = "getName")
        @NotNull
        public final String getName() {
            String name = this._builder.getName();
            Intrinsics.checkNotNullExpressionValue(name, "_builder.getName()");
            return name;
        }

        public final /* synthetic */ DslList getOptions() {
            List<Option> optionsList = this._builder.getOptionsList();
            Intrinsics.checkNotNullExpressionValue(optionsList, "_builder.getOptionsList()");
            return new DslList(optionsList);
        }

        @JvmName(name = "getSourceContext")
        @NotNull
        public final SourceContext getSourceContext() {
            SourceContext sourceContext = this._builder.getSourceContext();
            Intrinsics.checkNotNullExpressionValue(sourceContext, "_builder.getSourceContext()");
            return sourceContext;
        }

        @JvmName(name = "getSyntax")
        @NotNull
        public final Syntax getSyntax() {
            Syntax syntax = this._builder.getSyntax();
            Intrinsics.checkNotNullExpressionValue(syntax, "_builder.getSyntax()");
            return syntax;
        }

        public final boolean hasSourceContext() {
            return this._builder.hasSourceContext();
        }

        @JvmName(name = "plusAssignAllEnumvalue")
        public final /* synthetic */ void plusAssignAllEnumvalue(DslList<EnumValue, EnumvalueProxy> dslList, Iterable<EnumValue> values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            addAllEnumvalue(dslList, values);
        }

        @JvmName(name = "plusAssignAllOptions")
        public final /* synthetic */ void plusAssignAllOptions(DslList<Option, OptionsProxy> dslList, Iterable<Option> values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            addAllOptions(dslList, values);
        }

        @JvmName(name = "plusAssignEnumvalue")
        public final /* synthetic */ void plusAssignEnumvalue(DslList<EnumValue, EnumvalueProxy> dslList, EnumValue value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            addEnumvalue(dslList, value);
        }

        @JvmName(name = "plusAssignOptions")
        public final /* synthetic */ void plusAssignOptions(DslList<Option, OptionsProxy> dslList, Option value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            addOptions(dslList, value);
        }

        @JvmName(name = "setEnumvalue")
        public final /* synthetic */ void setEnumvalue(DslList dslList, int i11, EnumValue value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setEnumvalue(i11, value);
        }

        @JvmName(name = "setName")
        public final void setName(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setName(value);
        }

        @JvmName(name = "setOptions")
        public final /* synthetic */ void setOptions(DslList dslList, int i11, Option value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setOptions(i11, value);
        }

        @JvmName(name = "setSourceContext")
        public final void setSourceContext(@NotNull SourceContext value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSourceContext(value);
        }

        @JvmName(name = "setSyntax")
        public final void setSyntax(@NotNull Syntax value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSyntax(value);
        }
    }

    private EnumKt() {
    }
}
