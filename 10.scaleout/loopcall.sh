
for ((i=0; i < 1000; i++))
do
    echo "call $i "
    curl -s http://my.springtest/myapp &
#    wget -q -O- http://my.springtest/myapp
done

