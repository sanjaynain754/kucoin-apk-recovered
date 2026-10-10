package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.cfg.InterfaceC6343a;

/* JADX INFO: loaded from: classes45.dex */
public enum MapperFeature implements InterfaceC6343a {
    USE_ANNOTATIONS(true),
    USE_GETTERS_AS_SETTERS(true),
    PROPAGATE_TRANSIENT_MARKER(false),
    AUTO_DETECT_CREATORS(true),
    AUTO_DETECT_FIELDS(true),
    AUTO_DETECT_GETTERS(true),
    AUTO_DETECT_IS_GETTERS(true),
    AUTO_DETECT_SETTERS(true),
    REQUIRE_SETTERS_FOR_GETTERS(false),
    ALLOW_FINAL_FIELDS_AS_MUTATORS(true),
    INFER_PROPERTY_MUTATORS(true),
    INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES(true),
    ALLOW_VOID_VALUED_PROPERTIES(false),
    CAN_OVERRIDE_ACCESS_MODIFIERS(true),
    OVERRIDE_PUBLIC_ACCESS_MODIFIERS(true),
    USE_STATIC_TYPING(false),
    USE_BASE_TYPE_AS_DEFAULT_IMPL(false),
    INFER_BUILDER_TYPE_BINDINGS(true),
    DEFAULT_VIEW_INCLUSION(true),
    SORT_PROPERTIES_ALPHABETICALLY(false),
    SORT_CREATOR_PROPERTIES_FIRST(true),
    ACCEPT_CASE_INSENSITIVE_PROPERTIES(false),
    ACCEPT_CASE_INSENSITIVE_ENUMS(false),
    ACCEPT_CASE_INSENSITIVE_VALUES(false),
    USE_WRAPPER_NAME_AS_PROPERTY_NAME(false),
    USE_STD_BEAN_NAMING(false),
    ALLOW_EXPLICIT_PROPERTY_RENAMING(false),
    ALLOW_COERCION_OF_SCALARS(true),
    IGNORE_DUPLICATE_MODULE_REGISTRATIONS(true),
    IGNORE_MERGE_FOR_UNMERGEABLE(true),
    BLOCK_UNSAFE_POLYMORPHIC_BASE_TYPES(false),
    APPLY_DEFAULT_VALUES(true);

    private final boolean _defaultState;
    private final long _mask = 1 << ordinal();

    @Deprecated
    public boolean enabledIn(int i11) {
        return (((long) i11) & this._mask) != 0;
    }

    @Override // com.fasterxml.jackson.databind.cfg.InterfaceC6343a
    public boolean enabledByDefault() {
        return this._defaultState;
    }

    public boolean enabledIn(long j11) {
        return (j11 & this._mask) != 0;
    }

    public long getLongMask() {
        return this._mask;
    }

    @Override // com.fasterxml.jackson.databind.cfg.InterfaceC6343a
    @Deprecated
    public int getMask() {
        return (int) this._mask;
    }

    MapperFeature(boolean z11) {
        this._defaultState = z11;
    }

    public static long collectLongDefaults() {
        long longMask = 0;
        for (MapperFeature mapperFeature : values()) {
            if (mapperFeature.enabledByDefault()) {
                longMask |= mapperFeature.getLongMask();
            }
        }
        return longMask;
    }
}
