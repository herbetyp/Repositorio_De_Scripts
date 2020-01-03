import requests
import json
from datetime import datetime

from time import sleep

while True:
    req = requests.get(
        'https://economia.awesomeapi.com.br/all/USD-BRL,EUR-BRL,BTC-BRL')
    dic = json.loads(req.text)

    now = datetime.now()

    print('== Cotação ==')
    print(f'Data: {now.date()}\nHorário: {now.time()}')
    print(f'Dólar: US$ {dic["USD"]["high"]}')
    print(f'Euro: € {dic["EUR"]["high"]}')
    print(f'Bitcoin: BTC {dic["BTC"]["high"]}\n')
    sleep(3)
