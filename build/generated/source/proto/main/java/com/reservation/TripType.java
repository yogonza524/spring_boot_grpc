// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reservation.proto

package com.reservation;

/**
 * Protobuf enum {@code TripType}
 */
public enum TripType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNKNOWN_TRIP_TYPE = 0;</code>
   */
  UNKNOWN_TRIP_TYPE(0),
  /**
   * <code>ROUND_TRIP = 1;</code>
   */
  ROUND_TRIP(1),
  /**
   * <code>ONE_WAY = 2;</code>
   */
  ONE_WAY(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNKNOWN_TRIP_TYPE = 0;</code>
   */
  public static final int UNKNOWN_TRIP_TYPE_VALUE = 0;
  /**
   * <code>ROUND_TRIP = 1;</code>
   */
  public static final int ROUND_TRIP_VALUE = 1;
  /**
   * <code>ONE_WAY = 2;</code>
   */
  public static final int ONE_WAY_VALUE = 2;


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
  public static TripType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TripType forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_TRIP_TYPE;
      case 1: return ROUND_TRIP;
      case 2: return ONE_WAY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TripType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TripType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TripType>() {
          public TripType findValueByNumber(int number) {
            return TripType.forNumber(number);
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
    return com.reservation.ReservationOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final TripType[] VALUES = values();

  public static TripType valueOf(
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

  private TripType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:TripType)
}

