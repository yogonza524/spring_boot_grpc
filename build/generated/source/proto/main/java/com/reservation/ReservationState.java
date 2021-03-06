// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reservation.proto

package com.reservation;

/**
 * Protobuf enum {@code ReservationState}
 */
public enum ReservationState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNKNOWN_RESERVATION_STATE = 0;</code>
   */
  UNKNOWN_RESERVATION_STATE(0),
  /**
   * <code>RESERVED = 1;</code>
   */
  RESERVED(1),
  /**
   * <code>EMITED = 2;</code>
   */
  EMITED(2),
  /**
   * <code>PENDING_EMISION = 3;</code>
   */
  PENDING_EMISION(3),
  /**
   * <code>ERROR = 4;</code>
   */
  ERROR(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNKNOWN_RESERVATION_STATE = 0;</code>
   */
  public static final int UNKNOWN_RESERVATION_STATE_VALUE = 0;
  /**
   * <code>RESERVED = 1;</code>
   */
  public static final int RESERVED_VALUE = 1;
  /**
   * <code>EMITED = 2;</code>
   */
  public static final int EMITED_VALUE = 2;
  /**
   * <code>PENDING_EMISION = 3;</code>
   */
  public static final int PENDING_EMISION_VALUE = 3;
  /**
   * <code>ERROR = 4;</code>
   */
  public static final int ERROR_VALUE = 4;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ReservationState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ReservationState forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_RESERVATION_STATE;
      case 1: return RESERVED;
      case 2: return EMITED;
      case 3: return PENDING_EMISION;
      case 4: return ERROR;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ReservationState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ReservationState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ReservationState>() {
          public ReservationState findValueByNumber(int number) {
            return ReservationState.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.reservation.ReservationOuterClass.getDescriptor().getEnumTypes().get(1);
  }

  private static final ReservationState[] VALUES = values();

  public static ReservationState valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ReservationState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:ReservationState)
}

