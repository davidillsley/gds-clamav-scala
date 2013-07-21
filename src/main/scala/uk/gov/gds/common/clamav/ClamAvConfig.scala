package uk.gov.gds.common.clamav

trait ClamAvConfig {

  /*
   * Should virus checking be enabled
   */

  val antivirusActive = true

  /*
  * Size of chunks in bytes to read in / out of clamd
  */

  val chunkSize = 32768

  /*
  * IP address of clamd daemon
  */

  val host = "127.0.0.1"

  /**
   * port of clamd daemon
   */

  val port = 3310

  /**
   * Socket timeout for clam
   */

  val timeout = 5000

  /**
   * The number of threads to have in the pool to run antivirus conversion / copying
   */

  val threadPoolSize = 20

  /**
   * Clam socket commands
   */
  val instream = "zINSTREAM\0"
  val ping = "zPING\0"
  val status = "nSTATS\n"

  // OK response from clam
  val okResponse = "stream: OK"
}