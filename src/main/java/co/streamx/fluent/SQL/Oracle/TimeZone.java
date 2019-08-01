package co.streamx.fluent.SQL.Oracle;

import co.streamx.fluent.notation.Literal;

@Literal
public enum TimeZone {
    AST, ADT, // Atlantic Standard or Daylight Time

    BST, BDT, // Bering Standard or Daylight Time

    CST, CDT, // Central Standard or Daylight Time

    EST, EDT, // Eastern Standard or Daylight Time

    GMT, // Greenwich Mean Time

    HST, HDT, // Alaska-Hawaii Standard Time or Daylight Time.

    MST, MDT, // Mountain Standard or Daylight Time

    NST, // Newfoundland Standard Time

    PST, PDT, // Pacific Standard or Daylight Time

    YST, YDT, // Yukon Standard or Daylight Time
}
