// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reservation.proto

package com.reservation;

public interface PassengerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Passenger)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string last_name = 3;</code>
   * @return The lastName.
   */
  java.lang.String getLastName();
  /**
   * <code>string last_name = 3;</code>
   * @return The bytes for lastName.
   */
  com.google.protobuf.ByteString
      getLastNameBytes();

  /**
   * <code>.Country country = 4;</code>
   * @return Whether the country field is set.
   */
  boolean hasCountry();
  /**
   * <code>.Country country = 4;</code>
   * @return The country.
   */
  com.reservation.Country getCountry();
  /**
   * <code>.Country country = 4;</code>
   */
  com.reservation.CountryOrBuilder getCountryOrBuilder();

  /**
   * <code>int32 dni = 5;</code>
   * @return The dni.
   */
  int getDni();

  /**
   * <code>int32 random_number = 6;</code>
   * @return The randomNumber.
   */
  int getRandomNumber();
}
