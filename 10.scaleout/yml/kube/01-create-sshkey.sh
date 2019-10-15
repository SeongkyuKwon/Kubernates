ssh-keygen -b 4096 -f ~/.ssh/id_rsa -N ""
cat ~/.ssh/id_rsa.pub | sudo tee -a ~/.ssh/authorized_keys
