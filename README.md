# SparkStreamingTCPExample

Counts word in UTF8 encoded,'\n' delimited text received from network every second.Application runs on localhost:9999

Also it is applied windowed operations and stateful operation on DStream.With windowed operation,it is generating word counts over last 30 seconds of data, every 10 seconds.

#How to run

To run this on your local machine,firstly you need to run a Netcat server.

1-) To run Netcat server,open terminal and execute 'nc -lk 9999' 

2-) Then run  the NetworkWordCount object class from intellij

3-) In the netcat terminal,write "Hello World",then in the intellij console,you will see processed data which is processed by
spark streaming
